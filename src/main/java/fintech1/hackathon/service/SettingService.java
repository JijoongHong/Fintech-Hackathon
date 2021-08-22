package fintech1.hackathon.service;

import fintech1.hackathon.dto.Member.LivingFeeDto;
import fintech1.hackathon.dto.Member.MemberDto;
import fintech1.hackathon.dto.Member.PreferenceDto;
import fintech1.hackathon.entity.Member.LivingFee;
import fintech1.hackathon.entity.Member.Member;
import fintech1.hackathon.entity.Member.Preference;
import fintech1.hackathon.repository.LivingFeeRepository;
import fintech1.hackathon.repository.MemberRepository;
import fintech1.hackathon.repository.PreferenceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;

@RequiredArgsConstructor
@Service
public class SettingService {
    private final LivingFeeRepository livingFeeRepository;
    private final MemberRepository memberRepository;
    private final PreferenceRepository preferenceRepository;

    public LivingFee save(LivingFeeDto livingFeeDto, String email){

        LivingFee livingFee = livingFeeRepository.findByEmail(email)
                .orElseThrow(()->new UsernameNotFoundException(email));

        livingFee.setRent(livingFeeDto.getRent());
        livingFee.setMgmtFee(livingFeeDto.getMgmtFee());
        livingFee.setTargetExpenses(livingFeeDto.getTargetExpenses());
        livingFee.setIsAutopay(livingFeeDto.getIsAutopay());
        livingFee.setAutopayDay(livingFeeDto.getAutopayDay());
        livingFee.setBankCode(livingFeeDto.getBankCode());
        livingFee.setAccount(livingFeeDto.getAccount());
        livingFee.setTargetBankCode(livingFeeDto.getTargetBankCode());
        livingFee.setTargetAccount(livingFeeDto.getTargetAccount());

        return livingFeeRepository.save(livingFee);
    }
    /*
    public Preference save(PreferenceDto preferenceDto){
        return preferenceRepository.save(Preference.builder()
                .riskTaking(preferenceDto.getRiskTaking())
                .savings(preferenceDto.isSavings())
                .stock(preferenceDto.isStock())
                .alternative(preferenceDto.isAlternative())
                .card(preferenceDto.isCard())
                .insurance(preferenceDto.isInsurance())
                .pension(preferenceDto.isPension())
                .loan(preferenceDto.isLoan())
                .food(preferenceDto.isFood())
                .fresh(preferenceDto.isFresh())
                .cleaning(preferenceDto.isCleaning())
                .householdGoods(preferenceDto.isHouseholdGoods())
                .liquor(preferenceDto.isLiquor())
                .contents(preferenceDto.isContents())
                .pet(preferenceDto.isPet())
                .build()
        );
    }*/

    public Member getMemberInfo(String email) {
        return memberRepository.findByEmail(email).
                orElseThrow(()->new UsernameNotFoundException(email));
    }

    public LivingFee getLivingFeeInfo(String email) {
        return livingFeeRepository.findByEmail(email).
                orElseThrow(()->new UsernameNotFoundException(email));
    }

    public Preference getPreferenceInfo(String email) {
        return preferenceRepository.findByEmail(email).
                orElseThrow(()->new UsernameNotFoundException(email));
    }
}
