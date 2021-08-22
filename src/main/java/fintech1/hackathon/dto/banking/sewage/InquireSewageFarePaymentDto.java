package fintech1.hackathon.dto.banking.sewage;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Data
@Getter
@Setter
public class InquireSewageFarePaymentDto {
    @JsonProperty("Iqtcnt")
    private String Iqtcnt;
    @JsonProperty("TotCnt")
    private String TotCnt;
    @JsonProperty("CtntDataYn")
    private String CtntDataYn;
    @JsonProperty("Rec")
    private List<SewageFareDto> Rec;
}
