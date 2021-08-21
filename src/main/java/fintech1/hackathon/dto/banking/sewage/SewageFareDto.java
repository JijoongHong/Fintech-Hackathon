package fintech1.hackathon.dto.banking.sewage;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SewageFareDto {
    @JsonProperty("PbtxGroNo")
    private String PbtxGroNo;
    @JsonProperty("PbtxInstClasCd")
    private String PbtxInstClasCd;
    @JsonProperty("PbtxPytxno")
    private String PbtxPytxno;
    @JsonProperty("PbtxElcrPmntNo")
    private String PbtxElcrPmntNo;
    @JsonProperty("Isnm")
    private String Isnm;
    @JsonProperty("TxitNm")
    private String TxitNm;
    @JsonProperty("PbtxNtfFrmt")
    private String PbtxNtfFrmt;
    @JsonProperty("Tram")
    private String Tram;
    @JsonProperty("PbtxTmpmDsnc")
    private String PbtxTmpmDsnc;
    @JsonProperty("TmpmWthnDay")
    private String TmpmWthnDay;
    @JsonProperty("PbtxAhstRcvDvCd")
    private String PbtxAhstRcvDvCd;
    @JsonProperty("PbtxAttrRgsnYn")
    private String PbtxAttrRgsnYn;
}
