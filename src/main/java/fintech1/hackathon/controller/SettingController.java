package fintech1.hackathon.controller;

import fintech1.hackathon.dto.Member.LivingFeeDto;
import fintech1.hackathon.dto.Member.MemberDto;
import fintech1.hackathon.dto.Member.PreferenceDto;
import fintech1.hackathon.entity.Member.LivingFee;
import fintech1.hackathon.entity.Member.Member;
import fintech1.hackathon.entity.Member.Preference;
import fintech1.hackathon.service.SettingService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RequiredArgsConstructor
@Controller
public class SettingController {

    private final SettingService settingService;

    @GetMapping("/setting")
    public String showInfo(@AuthenticationPrincipal Member authedMember, Model model){
        String email = authedMember.getEmail();
        Member member = settingService.getMemberInfo(email);
        LivingFee livingFee = settingService.getLivingFeeInfo(email);
        //Preference preference = settingService.getPreferenceInfo(email);
        model.addAttribute("name", member.getName());
        model.addAttribute("email", member.getEmail());
        model.addAttribute("birth", member.getBirth());

        //model.addAttribute("password", member.getPassword());
        model.addAttribute("rent", livingFee.getRent());
        model.addAttribute("mgmtFee", livingFee.getMgmtFee());
        model.addAttribute("targetExpenses", livingFee.getTargetExpenses());
        model.addAttribute("isAutopay", livingFee.getIsAutopay());
        model.addAttribute("autopayDay", livingFee.getAutopayDay());
        model.addAttribute("account", livingFee.getAccount());
        model.addAttribute("bankCode", livingFee.getBankCode());
        model.addAttribute("targetAccount", livingFee.getTargetAccount());
        model.addAttribute("targetBankCode", livingFee.getTargetBankCode());
        /*
        model.addAttribute("riskTaking", preference.getRiskTaking());
        model.addAttribute("savings", preference.isSavings());
        model.addAttribute("stock", preference.isStock());
        model.addAttribute("alternative", preference.isAlternative());
        model.addAttribute("card", preference.isCard());
        model.addAttribute("insurance", preference.isInsurance());
        model.addAttribute("pension", preference.isPension());
        model.addAttribute("loan", preference.isLoan());
        model.addAttribute("food", preference.isFood());
        model.addAttribute("fresh", preference.isFresh());
        model.addAttribute("cleaning", preference.isCleaning());
        model.addAttribute("householdGoods", preference.isHouseholdGoods());
        model.addAttribute("liquor", preference.isLiquor());
        model.addAttribute("contents", preference.isContents());
        model.addAttribute("pet", preference.isPet());*/
        System.out.println("model = " + model);
        return "setting";
    }

    @PostMapping("/setting/post")
    public String updateLivingFee(LivingFeeDto livingFeeDto, @AuthenticationPrincipal Member authedMember) {
        String email = authedMember.getEmail();
        System.out.println("@@@@@@@@@@@@livingFeeDto@@@@@@@@@@ = " + livingFeeDto.getAccount());
        settingService.save(livingFeeDto, email);
        return "redirect:/setting";
    }
}