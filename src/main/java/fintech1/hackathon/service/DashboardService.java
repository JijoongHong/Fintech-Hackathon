package fintech1.hackathon.service;

import fintech1.hackathon.dto.banking.HeaderDto;
import fintech1.hackathon.dto.banking.balance.InquireBalanceDto;
import fintech1.hackathon.dto.banking.balance.RequestInquireBalanceDto;
import fintech1.hackathon.dto.banking.electricity.InquireElectricityFarePaymentDto;
import fintech1.hackathon.dto.banking.electricity.RequestElectricityFarePaymentDto;
import fintech1.hackathon.dto.banking.electricity.RequestInquireElectricityFarePaymentDto;
import fintech1.hackathon.dto.banking.history.InquireTransactionHistoryDto;
import fintech1.hackathon.dto.banking.history.RequestInquireTransactionHistoryDto;
import fintech1.hackathon.dto.banking.sewage.InquireSewageFarePaymentDto;
import fintech1.hackathon.dto.banking.sewage.RequestInquireSewageFarePaymentDto;
import fintech1.hackathon.dto.banking.sewage.RequestSewageFarePaymentDto;
import fintech1.hackathon.entity.Member.LivingFee;
import fintech1.hackathon.feign.OpenBankingFeign;
import fintech1.hackathon.repository.LivingFeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@RequiredArgsConstructor
@Service
public class DashboardService {

    @Autowired
    OpenBankingFeign openBankingFeign;
    private final LivingFeeRepository livingFeeRepository;


    public void requestElectricityFarePayment() {
        RequestElectricityFarePaymentDto requestElectricityFarePaymentDto = new RequestElectricityFarePaymentDto();
        openBankingFeign.requestElectricityFarePayment(requestElectricityFarePaymentDto);
    }

    public void requestSewageFarePayment() {
        RequestSewageFarePaymentDto requestSewageFarePaymentDto = new RequestSewageFarePaymentDto();
        openBankingFeign.requestSewageFarePayment(requestSewageFarePaymentDto);
    }

    public InquireElectricityFarePaymentDto requestInquireElectricityFarePayment() {
        RequestInquireElectricityFarePaymentDto requestInquireElectricityFarePaymentDto = new RequestInquireElectricityFarePaymentDto();
        InquireElectricityFarePaymentDto inquireElectricityFarePaymentDto = openBankingFeign.requestInquireElectricityFarePayment(requestInquireElectricityFarePaymentDto);
        return inquireElectricityFarePaymentDto;
    }

    public InquireSewageFarePaymentDto requestInquireSewageFarePayment() {
        RequestInquireSewageFarePaymentDto requestInquireSewageFarePaymentDto = new RequestInquireSewageFarePaymentDto();
        InquireSewageFarePaymentDto inquireSewageFarePaymentDto = openBankingFeign.requestInquireSewageFarePayment(requestInquireSewageFarePaymentDto);
        return inquireSewageFarePaymentDto;
    }


    //거래내역 바탕으로 사용금액 반환 메소드
    public InquireTransactionHistoryDto requestInquireTransactionHistory(String email) throws UsernameNotFoundException {
        LivingFee livingFee = livingFeeRepository.findByEmail(email).orElseThrow(()->new UsernameNotFoundException(email));
        RequestInquireTransactionHistoryDto requestinquireTransactionHistoryDto = new RequestInquireTransactionHistoryDto(livingFee.getAccount());
        InquireTransactionHistoryDto inquireTransactionHistoryDto = openBankingFeign.requestInquireTransactionHistory(requestinquireTransactionHistoryDto);
        //topFour(inquireTransactionHistoryDto);
        return inquireTransactionHistoryDto;
    }

    /*거래내역 바탕으로 상위 4개 항목 반환 메소드
    public List<HashMap<String, Integer>> topFour(InquireTransactionHistoryDto inquireTransactionHistoryDto){
        List<Object> objects = new List<new HashMap<String, Integer>()>();
        return ;
    }*/


}
