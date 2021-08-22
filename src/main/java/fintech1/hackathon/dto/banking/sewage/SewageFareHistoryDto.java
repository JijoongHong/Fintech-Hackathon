package fintech1.hackathon.dto.banking.sewage;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class SewageFareHistoryDto {
    @JsonProperty("PmntPtrn")
    private String PmntPtrn;
    @JsonProperty("RcrdSbjc")
    private String RcrdSbjc;
    @JsonProperty("PmntStcd")
    private String PmntStcd;
    @JsonProperty("Txpr")
    private String Txpr;
    @JsonProperty("TxtnIntt")
    private String TxtnIntt;
    @JsonProperty("PmntAmt")
    private String PmntAmt;
    @JsonProperty("PmntDln")
    private String PmntDln;
    @JsonProperty("ElcrPmntNo")
    private String ElcrPmntNo;
    @JsonProperty("Drano")
    private String Drano;
    @JsonProperty("PmntTm")
    private String PmntTm;
    @JsonProperty("PmntYmd")
    private String PmntYmd;
}
