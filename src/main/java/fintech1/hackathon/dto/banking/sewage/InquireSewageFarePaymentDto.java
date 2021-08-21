package fintech1.hackathon.dto.banking.sewage;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data
public class InquireSewageFarePaymentDto {
    @JsonProperty("Iqtcnt")
    private String Iqtcnt;
    @JsonProperty("TonCnt")
    private String TonCnt;
    @JsonProperty("CtntDataYn")
    private String CtntDataYn;
    @JsonProperty("rec")
    private List<SewageFareDto> rec;
}
