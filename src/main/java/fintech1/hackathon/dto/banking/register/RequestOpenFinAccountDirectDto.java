package fintech1.hackathon.dto.banking.register;

import com.fasterxml.jackson.annotation.JsonProperty;
import fintech1.hackathon.dto.banking.HeaderDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class RequestOpenFinAccountDirectDto {
    @JsonProperty("Header")
    private HeaderDto headerDto;
    @JsonProperty("DrtrRgyn")
    private String DrtrRgyn = "Y";
    @JsonProperty("BrdtBrno")
    private String BrdtBrno;
    @JsonProperty("Bncd")
    private String Bncd = "011";
    @JsonProperty("Acno")
    private String Acno;
}
