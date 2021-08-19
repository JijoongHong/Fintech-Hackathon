package fintech1.hackathon.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {
    private String name;
    private String email;
    private String password;
    private String auth;
    private String birth;
    private Integer rent;
    private Integer mgmtFee;
    private Integer targetExpenses;
    private Boolean isAutopay;
    private String autopayDay;
    private String account;
    private String bankCode;
}
