package fintech1.hackathon.service;

import fintech1.hackathon.dto.banking.HeaderDto;
import fintech1.hackathon.dto.banking.InquireBalanceDto;
import fintech1.hackathon.dto.banking.RequestInquireBalanceDto;
import fintech1.hackathon.feign.OpenBankingFeign;
import fintech1.hackathon.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j

public class OpenBankingService {
    @Autowired
    OpenBankingFeign openBankingFeign;

    private String FinAcno = "00820100010590000000000011165";

    public InquireBalanceDto requestBalance(){
        RequestInquireBalanceDto requestInquireBalanceDto = new RequestInquireBalanceDto(new HeaderDto("InquireBalance"), FinAcno);
        System.out.println("requestInquireBalanceDto = " + requestInquireBalanceDto.toString());
        return openBankingFeign.requestInquireBalance(requestInquireBalanceDto);
    }

}
