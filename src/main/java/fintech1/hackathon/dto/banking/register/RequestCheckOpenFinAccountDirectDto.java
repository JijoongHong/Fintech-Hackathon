package fintech1.hackathon.dto.banking.register;

import com.fasterxml.jackson.annotation.JsonProperty;
import fintech1.hackathon.dto.banking.HeaderDto;

public class RequestCheckOpenFinAccountDirectDto {
    @JsonProperty("Header")
    private HeaderDto headerDto;
    @JsonProperty("Rgno")
    private String Rgno; // 등록번호
    @JsonProperty("BrdtBrno")
    private String BrdtBrno; //생년월일
}
