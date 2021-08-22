package fintech1.hackathon.dto.banking.sewage;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Data
@Getter
@Setter
public class InquireSewageFarePaymentHistoryDto {
    @JsonProperty("TotCnt")
    private String TotCnt;
    @JsonProperty("PageNo")
    private String PageNo;
    @JsonProperty("IqtCnt")
    private String IqtCnt;
    @JsonProperty("CtntDataYn")
    private String CtntDataYn;
    @JsonProperty("REC")
    private List<SewageFareHistoryDto> REC;
}
