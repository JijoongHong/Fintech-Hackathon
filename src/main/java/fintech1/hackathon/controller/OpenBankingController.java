package fintech1.hackathon.controller;

import fintech1.hackathon.dto.banking.HeaderDto;
import fintech1.hackathon.dto.banking.InquireBalanceDto;
import fintech1.hackathon.dto.banking.RequestInquireBalanceDto;
import fintech1.hackathon.feign.OpenBankingFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods = RequestMethod.POST)
public class OpenBankingController {
    @Autowired
    private OpenBankingFeign openBankingFeign;

    private String Iscd = "${Iscd}";
    private String FintechApsno = "001";
    private String ApiSvcCd = "ReceivedTransferA";
    private String AccessToken = "${access_token}";
    private String FinAcno = "00820100010590000000000011165";

    //@Value("${}")
    //@PostMapping("/dashboard")
    //@PostMapping("/setting")

    //@PostMapping("/balance")
    @RequestMapping(path="/balance",  consumes = "application/json", produces = "application/json")
    public InquireBalanceDto requestBalance(@RequestBody RequestInquireBalanceDto requestInquireBalanceDto){
        requestInquireBalanceDto.setHeaderDto(new HeaderDto("InquireBalance"));
        InquireBalanceDto inquireBalanceDto = openBankingFeign.requestInquireBalance(requestInquireBalanceDto);
        System.out.println("inquireBalanceDto = " + inquireBalanceDto.getLdbl());
        return inquireBalanceDto;
    }


}
