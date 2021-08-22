package fintech1.hackathon.service;

import fintech1.hackathon.dto.Member.LivingFeeDto;
import fintech1.hackathon.dto.Member.MemberDto;
import fintech1.hackathon.entity.Member.LivingFee;
import fintech1.hackathon.entity.Member.Member;
import fintech1.hackathon.repository.LivingFeeRepository;
import fintech1.hackathon.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MemberService implements UserDetailsService {

    private final MemberRepository memberRepository;
    private final LivingFeeRepository livingFeeRepository;

    @Override
    public Member loadUserByUsername(String email) throws UsernameNotFoundException {
        return memberRepository.findByEmail(email).
                orElseThrow(()->new UsernameNotFoundException(email));
    }
    @Transactional
    public Long save(MemberDto memberDto){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        memberDto.setPassword(encoder.encode(memberDto.getPassword()));
        //LivingFeeDto livingFeeDto = new LivingFeeDto();

        livingFeeRepository.save(LivingFee.builder()
                .email(memberDto.getEmail())
                .rent(0)
                .mgmtFee(0)
                .targetExpenses(0)
                .isAutopay(false)
                .autopayDay("")
                .bankCode("")
                .account("")
                .targetBankCode("")
                .targetAccount("")
                .build()).getSeq();


        return memberRepository.save(Member.builder()
                .email(memberDto.getEmail())
                .name(memberDto.getName())
                .birth(memberDto.getBirth())
                .password(memberDto.getPassword())
                .build()).getSeq();
    }
}