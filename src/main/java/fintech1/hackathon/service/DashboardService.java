package fintech1.hackathon.service;

import fintech1.hackathon.dto.banking.HeaderDto;
import fintech1.hackathon.dto.banking.balance.InquireBalanceDto;
import fintech1.hackathon.dto.banking.balance.RequestInquireBalanceDto;
import fintech1.hackathon.dto.banking.electricity.InquireElectricityFarePaymentDto;
import fintech1.hackathon.dto.banking.electricity.RequestElectricityFarePaymentDto;
import fintech1.hackathon.dto.banking.electricity.RequestInquireElectricityFarePaymentDto;
import fintech1.hackathon.dto.banking.history.AccountHistoryDto;
import fintech1.hackathon.dto.banking.history.InquireTransactionHistoryDto;
import fintech1.hackathon.dto.banking.history.RequestInquireTransactionHistoryDto;
import fintech1.hackathon.dto.banking.sewage.InquireSewageFarePaymentDto;
import fintech1.hackathon.dto.banking.sewage.RequestInquireSewageFarePaymentDto;
import fintech1.hackathon.dto.banking.sewage.RequestSewageFarePaymentDto;
import fintech1.hackathon.entity.Member.LivingFee;
import fintech1.hackathon.entity.Member.Member;
import fintech1.hackathon.feign.OpenBankingFeign;
import fintech1.hackathon.repository.LivingFeeRepository;
import fintech1.hackathon.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@RequiredArgsConstructor
@Service
public class DashboardService {

    @Autowired
    OpenBankingFeign openBankingFeign;
    private final LivingFeeRepository livingFeeRepository;
    private final MemberRepository memberRepository;


    public void requestElectricityFarePayment() {
        RequestElectricityFarePaymentDto requestElectricityFarePaymentDto = new RequestElectricityFarePaymentDto();
        openBankingFeign.requestElectricityFarePayment(requestElectricityFarePaymentDto);
    }

    public void requestSewageFarePayment() {
        RequestSewageFarePaymentDto requestSewageFarePaymentDto = new RequestSewageFarePaymentDto();
        openBankingFeign.requestSewageFarePayment(requestSewageFarePaymentDto);
    }

    //전기료 조회 - 완료
    public InquireElectricityFarePaymentDto requestInquireElectricityFarePayment() {
        RequestInquireElectricityFarePaymentDto requestInquireElectricityFarePaymentDto = new RequestInquireElectricityFarePaymentDto();
        InquireElectricityFarePaymentDto inquireElectricityFarePaymentDto = openBankingFeign.requestInquireElectricityFarePayment(requestInquireElectricityFarePaymentDto);
        return inquireElectricityFarePaymentDto;
    }

    //수도세 조회 - 완료
    public InquireSewageFarePaymentDto requestInquireSewageFarePayment() {
        RequestInquireSewageFarePaymentDto requestInquireSewageFarePaymentDto = new RequestInquireSewageFarePaymentDto();
        InquireSewageFarePaymentDto inquireSewageFarePaymentDto = openBankingFeign.requestInquireSewageFarePayment(requestInquireSewageFarePaymentDto);
        return inquireSewageFarePaymentDto;
    }

    /**거래내역 바탕으로 사용금액 반환 메소드 - 테스트 필요*/
    public Integer requestInquireTransactionHistory(){//String email) throws UsernameNotFoundException {
        //LivingFee livingFee = livingFeeRepository.findByEmail(email).orElseThrow(()->new UsernameNotFoundException(email));
        //RequestInquireTransactionHistoryDto requestinquireTransactionHistoryDto = new RequestInquireTransactionHistoryDto(livingFee.getAccount());
        RequestInquireTransactionHistoryDto requestinquireTransactionHistoryDto = new RequestInquireTransactionHistoryDto("002","1000001213002");
        System.out.println("requestinquireTransactionHistoryDto = " + requestinquireTransactionHistoryDto);
        InquireTransactionHistoryDto inquireTransactionHistoryDto = openBankingFeign.requestInquireTransactionHistory(requestinquireTransactionHistoryDto);
        System.out.println("inquireTransactionHistoryDto = " + inquireTransactionHistoryDto);
        Integer totalExpenses = 0;
        for(AccountHistoryDto history: inquireTransactionHistoryDto.getREC()){
            totalExpenses += Integer.parseInt(history.getTram());
        }
        System.out.println("totalExpenses = " + totalExpenses);
        topFour(inquireTransactionHistoryDto);
        return totalExpenses;
    }

    /**거래내역 바탕으로 상위 4개 항목 반환 메소드 - 테스트 필요*/
    public HashMap<String, Integer> topFour(InquireTransactionHistoryDto inquireTransactionHistoryDto){
        HashMap<String, Integer> topExpenses = new HashMap<String, Integer>();
        for(AccountHistoryDto history: inquireTransactionHistoryDto.getREC()){
            System.out.println(history.getBnprCntn());
            if ((history.getBnprCntn().contains("식비간식")||history.getBnprCntn().contains("쇼핑")||history.getBnprCntn().contains("여행숙박")||history.getBnprCntn().contains("미용건강"))
                    && history.getMnrcDrotDsnc().equals("2")){
                if (topExpenses.containsKey(history.getBnprCntn()))
                    topExpenses.put(history.getBnprCntn(), topExpenses.get(history.getBnprCntn())+Integer.parseInt(history.getTram()));
                else
                    topExpenses.put(history.getBnprCntn(), Integer.parseInt(history.getTram()));
            }
        }
        System.out.println("topExpenses = " + topExpenses);
        topExpenses = sortMapByKey(topExpenses);
        System.out.println("topExpenses = " + topExpenses);

        return topExpenses;
    }

    public static LinkedHashMap<String, Integer> sortMapByKey(HashMap<String, Integer> map) {
        List<HashMap.Entry<String, Integer>> entries = new LinkedList<>(map.entrySet());
        Collections.sort(entries, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entries) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public Member getMemberInfo(String email) {
        return memberRepository.findByEmail(email).
                orElseThrow(()->new UsernameNotFoundException(email));
    }

    public LivingFee getLivingFeeInfo(String email) {
        return livingFeeRepository.findByEmail(email).
                orElseThrow(()->new UsernameNotFoundException(email));
    }
}
