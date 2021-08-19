package fintech1.hackathon.controller;

import fintech1.hackathon.feign.OpenBankingFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods = RequestMethod.POST)
public class OpenBankingController {
    @Autowired
    private OpenBankingFeign openBankingFeign;

    //@PostMapping("/dashboard")
    //@PostMapping("/setting")



}
