package fintech1.hackathon.dto.banking.register;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CheckOpenFinAccountDirectDto {
    @JsonProperty("FinAcno")
    private String FinAcno;
    @JsonProperty("Dpnm")
    private String Dpnm;
}
