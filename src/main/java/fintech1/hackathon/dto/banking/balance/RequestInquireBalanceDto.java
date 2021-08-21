package fintech1.hackathon.dto.banking.balance;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import fintech1.hackathon.dto.banking.HeaderDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class RequestInquireBalanceDto {
    @JsonProperty("Header")
    private HeaderDto Header;
    @JsonProperty("FinAcno")
    private String FinAcno;
}
