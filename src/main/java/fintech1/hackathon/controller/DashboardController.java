package fintech1.hackathon.controller;

import fintech1.hackathon.dto.banking.electricity.ElectricityFarePaymentDto;
import fintech1.hackathon.dto.banking.electricity.InquireElectricityFarePaymentDto;
import fintech1.hackathon.dto.banking.history.InquireTransactionHistoryDto;
import fintech1.hackathon.dto.banking.sewage.InquireSewageFarePaymentDto;
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

@RequiredArgsConstructor
@Controller
public class DashboardController {
    private final DashboardService dashboardService;

    @Autowired
    OpenBankingService openBankingService;

    @GetMapping("/dashboard")
    public String main(@AuthenticationPrincipal Member member, @AuthenticationPrincipal LivingFee livingFee, Model model){
        InquireElectricityFarePaymentDto electricityFareDto = dashboardService.requestInquireElectricityFarePayment();
        InquireSewageFarePaymentDto inquireSewageFarePaymentDto = dashboardService.requestInquireSewageFarePayment();

        String name = member.getName();
        Integer rent = livingFee.getRent();
        Integer mgmtFee = livingFee.getMgmtFee();
        Integer targetExpenses = livingFee.getTargetExpenses();
        Integer elecFee = Integer.parseInt(electricityFareDto.getTram());
        Integer sewageFee = Integer.parseInt(inquireSewageFarePaymentDto.getRec().get(0).getTram());

        model.addAttribute("name", name);
        model.addAttribute("rent", rent);
        model.addAttribute("mgmtFee", mgmtFee);
        model.addAttribute("targetExpenses", targetExpenses);
        model.addAttribute("elecFee", elecFee);
        model.addAttribute("sewageFee", sewageFee);


        return "main";
    }

    @PostMapping("/dashboard/electricity-pay")
    public String ElectricityPayment(@AuthenticationPrincipal Member member, @AuthenticationPrincipal LivingFee livingFee, Model model){
        dashboardService.requestElectricityFarePayment();
        return "electricity-pay";
    }

    @PostMapping("/dashboard/sewage-pay")
    public String SewagePayment(@AuthenticationPrincipal Member member, @AuthenticationPrincipal LivingFee livingFee, Model model){
        dashboardService.requestSewageFarePayment();
        return "sewage-pay";
    }

    @GetMapping("/dashboard/report")
    public String report(@AuthenticationPrincipal Member member, @AuthenticationPrincipal LivingFee livingFee, Model model){
        InquireTransactionHistoryDto inquireTransactionHistoryDto = dashboardService.requestInquireTransactionHistory(member.getEmail()); //전달 사용시 수정 필요
        return "report";

    }



}
