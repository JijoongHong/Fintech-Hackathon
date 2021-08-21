package fintech1.hackathon.dto.Member;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivingFeeDto {
    private String email;
    private Integer rent;
    private Integer mgmtFee;
    private Integer targetExpenses;
    private Boolean isAutopay;
    private String autopayDay;
    private String bankCode;
    private String account;
    private String targetBankCode;
    private String targetAccount;
}
