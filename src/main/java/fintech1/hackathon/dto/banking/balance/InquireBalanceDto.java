package fintech1.hackathon.dto.banking.balance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class InquireBalanceDto implements Serializable {

    public static InquireBalanceDto EMPTY = new InquireBalanceDto();
    @JsonProperty("FinAcno")
    private String FinAcno;
    @JsonProperty("Ldbl")
    private String Ldbl;
    @JsonProperty("RlpmAbmt")
    public String RlpmAbmt;
}
