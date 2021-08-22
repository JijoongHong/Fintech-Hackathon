package fintech1.hackathon.service;

import fintech1.hackathon.dto.Member.LivingFeeDto;
import fintech1.hackathon.entity.Member.LivingFee;
import fintech1.hackathon.repository.LivingFeeRepository;
import fintech1.hackathon.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;

@RequiredArgsConstructor
@Service
public class SettingService {
    private final LivingFeeRepository livingFeeRepository;
    private final MemberRepository memberRepository;


    public Long save(LivingFeeDto livingFeeDto){
        return livingFeeRepository.save(LivingFee.builder()
                .email(livingFeeDto.getEmail())
                .rent(livingFeeDto.getRent())
                .mgmtFee((livingFeeDto.getMgmtFee()))
                .targetExpenses(livingFeeDto.getTargetExpenses())
                .isAutopay(livingFeeDto.getIsAutopay())
                .autopayDay(livingFeeDto.getAutopayDay())
                .bankCode(livingFeeDto.getBankCode())
                .account(livingFeeDto.getAccount())
                .targetBankCode(livingFeeDto.getTargetBankCode())
                .targetAccount(livingFeeDto.getTargetAccount())
                .build()
        ).getSeq();
    }

}
