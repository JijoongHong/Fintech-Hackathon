package fintech1.hackathon.controller;

import fintech1.hackathon.dto.banking.balance.RequestInquireBalanceDto;
import fintech1.hackathon.dto.banking.electricity.ElectricityFarePaymentDto;
import fintech1.hackathon.dto.banking.electricity.InquireElectricityFarePaymentDto;
import fintech1.hackathon.dto.banking.history.InquireTransactionHistoryDto;
import fintech1.hackathon.dto.banking.sewage.InquireSewageFarePaymentDto;
import fintech1.hackathon.dto.banking.sewage.RequestInquireSewageFarePaymentDto;
import fintech1.hackathon.dto.banking.sewage.SewageFareDto;
import fintech1.hackathon.entity.Member.LivingFee;
import fintech1.hackathon.entity.Member.Member;
import fintech1.hackathon.service.DashboardService;
import fintech1.hackathon.service.MemberService;
import fintech1.hackathon.service.OpenBankingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;

@RequiredArgsConstructor
@Controller
public class DashboardController {
    private final DashboardService dashboardService;

    @Autowired
    OpenBankingService openBankingService;

    @GetMapping("/dashboard")
    public String main(@AuthenticationPrincipal Member authedMember, Model model){
        InquireElectricityFarePaymentDto electricityFareDto = dashboardService.requestInquireElectricityFarePayment();
        InquireSewageFarePaymentDto inquireSewageFarePaymentDto = dashboardService.requestInquireSewageFarePayment();
        String email = authedMember.getEmail();
        System.out.println("email = " + email);
        Member member = dashboardService.getMemberInfo(email);
        LivingFee livingFee = dashboardService.getLivingFeeInfo(email);

        Integer totalExpenses = dashboardService.requestInquireTransactionHistory();
        Integer elecFee = Integer.parseInt(electricityFareDto.getTram());
        Integer sewageFee = Integer.parseInt(inquireSewageFarePaymentDto.getRec().get(0).getTram());

        //HashMap<String, Integer> = dashboardService.re
        String name = member.getName();
        Integer rent = livingFee.getRent();
        Integer mgmtFee = livingFee.getMgmtFee();
        Integer targetExpenses = livingFee.getTargetExpenses();

        model.addAttribute("name", member.getName());
        model.addAttribute("rent", livingFee.getRent());
        model.addAttribute("mgmtFee", livingFee.getMgmtFee());
        model.addAttribute("targetExpenses", livingFee.getTargetExpenses());
        model.addAttribute("elecFee", elecFee);
        model.addAttribute("sewageFee", sewageFee);
        model.addAttribute("total", elecFee+sewageFee+rent+mgmtFee);

        return "dashboard";
    }

    @PostMapping("/dashboard/electricity-pay")
    public String ElectricityPayment(@AuthenticationPrincipal Member member, @AuthenticationPrincipal LivingFee livingFee, Model model){
        dashboardService.requestElectricityFarePayment();
        return "main";
    }

    @PostMapping("/dashboard/sewage-pay")
    public String SewagePayment(@AuthenticationPrincipal Member member, @AuthenticationPrincipal LivingFee livingFee, Model model){
        dashboardService.requestSewageFarePayment();
        return "main";
    }

/*
    @GetMapping("/dashboard/report")
    public String report(@AuthenticationPrincipal Member member, @AuthenticationPrincipal LivingFee livingFee, Model model){
        InquireTransactionHistoryDto inquireTransactionHistoryDto = dashboardService.requestInquireTransactionHistory(member.getEmail()); //전달 사용시 수정 필요
        return "report";

    }
*/


}
