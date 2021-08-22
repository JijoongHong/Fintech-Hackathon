package fintech1.hackathon.controller;

import fintech1.hackathon.dto.banking.balance.InquireBalanceDto;
import fintech1.hackathon.dto.banking.balance.RequestInquireBalanceDto;
import fintech1.hackathon.service.OpenBankingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class OpenBankingController {
    @Autowired
    OpenBankingService openBankingService;

    @RequestMapping(path="/balance")
    public InquireBalanceDto requestBalance(){
        return openBankingService.requestBalance();
    }

    @GetMapping(path="why")
    public RequestInquireBalanceDto requestInquireBalanceDto(){
        return openBankingService.test();
    }

}
