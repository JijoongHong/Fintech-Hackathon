package fintech1.hackathon.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Entity
@Getter
public class Member implements UserDetails {
    @Id
    @Column(name = "seq")
    @GeneratedValue //시퀀스 생성
    Long seq;

    @Column(name = "email", unique = true)
    String email;

    @Column(name = "name")
    String name;

    @Column(name = "password")
    String password;

    @Column(name = "auth")
    String auth;

    @Column(name = "birth")
    String birth;

    @Column(name = "rent")
    String rent;

    @Column(name = "mgmtFee")
    String mgmtFee;

    @Column(name = "targetExpenses")
    String targetExpenses;

    @Column(name = "isAutopay")
    String isAutopay;

    @Column(name = "autopayDay")
    String autopayDay;

    @Column(name = "account")
    String account;

    @Column(name = "bankCode")
    String bankCode;

    @Builder
    public Member(String email, String password, String name){
        this.email = email;
        this.password = password;
        this.name = name;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> roles = new HashSet<>();
        for (String role : auth.split(",")){
            roles.add(new SimpleGrantedAuthority(role));
        }
        return roles;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public String getPassword(){ return password; }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
