package fintech1.hackathon.controller;
import fintech1.hackathon.dto.Member.MemberDto;
import fintech1.hackathon.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequiredArgsConstructor
@Controller
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/user") //회원가입
    public String signUp(MemberDto memberDto, HttpServletRequest request, HttpServletResponse response) throws ServletException {
        memberService.save(memberDto);
        request.login(memberDto.getEmail(), memberDto.getPassword());
        return "redirect:/login";
    }

    @GetMapping(value = "logout")
    public String logoutPage(HttpServletRequest request, HttpServletResponse response){
        new SecurityContextLogoutHandler().logout(request, response, SecurityContextHolder.getContext().getAuthentication());
        return "redirect:/login";
    }


}