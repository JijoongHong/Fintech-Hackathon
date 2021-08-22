package fintech1.hackathon.dto.banking.history;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data
public class InquireTransactionHistoryDto {
    @JsonProperty("CtntDataYn")
    private String CtntDataYn;
    @JsonProperty("TopCnt")
    private String TopCnt;
    @JsonProperty("Iqtcnt")
    private String Iqtcnt;
    @JsonProperty("REC")
    private List<AccountHistoryDto> REC;
}
