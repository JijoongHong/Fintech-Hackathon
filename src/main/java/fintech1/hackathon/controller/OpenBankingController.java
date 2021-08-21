package fintech1.hackathon.controller;

import fintech1.hackathon.dto.banking.balance.InquireBalanceDto;
import fintech1.hackathon.dto.banking.balance.RequestInquireBalanceDto;
import fintech1.hackathon.service.OpenBankingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
//@CrossOrigin(origins = "*", methods = RequestMethod.POST)
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
    /*
    private String Iscd = "${Iscd}";
    private String FintechApsno = "001";
    private String ApiSvcCd = "ReceivedTransferA";
    private String AccessToken = "${access_token}";
    private String FinAcno = "00820100010590000000000011165";
    */
    //@Value("${}")
    //@PostMapping("/dashboard")
    //@PostMapping("/setting")

    //@PostMapping("/balance")
    /*
    @RequestMapping(path="/balance")
    public InquireBalanceDto requestBalance(){
        RequestInquireBalanceDto requestInquireBalanceDto = new RequestInquireBalanceDto(new HeaderDto("InquireBalance"), FinAcno);
        System.out.println("requestInquireBalanceDto = " + requestInquireBalanceDto.toString());
        InquireBalanceDto inquireBalanceDto = openBankingFeign.requestInquireBalance(requestInquireBalanceDto);
        System.out.println("inquireBalanceDto = " + inquireBalanceDto.getLdbl());
        return inquireBalanceDto;
    }*/




}
