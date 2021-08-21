package fintech1.hackathon.dto.banking.register;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OpenFinAccountDirectDto {
    @JsonProperty("Rgno")
    private String Rgno;
}
