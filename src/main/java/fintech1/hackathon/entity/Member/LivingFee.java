package fintech1.hackathon.entity.Member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@NoArgsConstructor
@Entity
public class LivingFee {
    @Id
    @Column(name = "seq")
    Long seq;

    @Column(name = "email")
    private String email;

    @Column(name = "rent")
    private Integer rent;

    @Column(name = "mgmtFee")
    private Integer mgmtFee;

    @Column(name = "targetExpenses")
    private Integer targetExpenses;

    @Column(name = "isAutopay")
    private Boolean isAutopay;

    @Column(name = "autopayDay")
    private String autopayDay;

    @Column(name = "bankCode")
    private String bankCode;

    @Column(name = "account")
    private String account;

    @Column(name = "targetBankCode")
    private String targetBankCode;

    @Column(name = "targetAccount")
    private String targetAccount;

    @Builder
    public LivingFee(String email, Integer rent, Integer mgmtFee, Integer targetExpenses, Boolean isAutopay, String autopayDay, String bankCode, String account, String targetBankCode, String targetAccount) {
        this.seq = seq;
        this.email = email;
        this.rent = rent;
        this.mgmtFee = mgmtFee;
        this.targetExpenses = targetExpenses;
        this.isAutopay = isAutopay;
        this.autopayDay = autopayDay;
        this.bankCode = bankCode;
        this.account = account;
        this.targetBankCode = targetBankCode;
        this.targetAccount = targetAccount;
    }
}
