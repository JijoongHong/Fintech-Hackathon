package fintech1.hackathon.dto.banking.electricity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data
public class InquireElectricityFarePaymentHistoryDto {
    @JsonProperty("IqtCnt")
    private String IqtCnt;
    @JsonProperty("CtntDataYn")
    private String CtntDataYn;
    @JsonProperty("TotCnt")
    private String TotCnt;
    @JsonProperty("PageNo")
    private String PageNo;
    @JsonProperty("rec")
    private List<ElectricityFareHistoryDto> rec;
}
