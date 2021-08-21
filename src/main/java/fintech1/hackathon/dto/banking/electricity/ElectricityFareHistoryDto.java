package fintech1.hackathon.dto.banking.electricity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ElectricityFareHistoryDto {
    @JsonProperty("ElcrPmntNo")
    private String ElcrPmntNo;
    @JsonProperty("Drano")
    private String Drano;
    @JsonProperty("PmntStcd")
    private String PmntStcd;
    @JsonProperty("PmntAmt")
    private String PmntAmt;
    @JsonProperty("PmntYmd")
    private String PmntYmd;
    @JsonProperty("PmntTm")
    private String PmntTm;
    @JsonProperty("PmntPtrn")
    private String PmntPtrn;
    @JsonProperty("Txpr")
    private String Txpr;
    @JsonProperty("TxtnIntt")
    private String TxtnIntt;
    @JsonProperty("PmntDln")
    private String PmntDln;
    @JsonProperty("RcrdSbjc")
    private String RcrdSbjc;
}
