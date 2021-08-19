package fintech1.hackathon.dto.banking;

import lombok.Data;

@Data
public class InquireBalanceDto {
    private String FinAcno;
    private String Ldbl;
    public String RlpmAbmt;
}
