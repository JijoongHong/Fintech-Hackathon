package fintech1.hackathon.dto.banking.sewage;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SewageFarePaymentDto {
    @JsonProperty("PbtxGroNo")
    private String PbtxGroNo;
    @JsonProperty("PbtxInstClasCd")
    private String PbtxInstClasCd;
    @JsonProperty("PbtxPytxno")
    private String PbtxPytxno;
    @JsonProperty("PbtxElcrPmntNo")
    private String PbtxElcrPmntNo;
    @JsonProperty("PayRcrdSbjcCntn")
    private String PayRcrdSbjcCntn;
    @JsonProperty("PryAmt")
    private String PryAmt;
    @JsonProperty("Isnm")
    private String Isnm;
    @JsonProperty("TmpmWthnDay")
    private String TmpmWthnDay;
    @JsonProperty("PryNm")
    private String PryNm;
}
