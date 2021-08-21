package fintech1.hackathon.dto.banking.electricity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ElectricityFarePaymentDto {
    @JsonProperty("Rpcd")
    private String Rpcd;
    @JsonProperty("InstClasCd")
    private String InstClasCd;
    @JsonProperty("PbtxGroNo")
    private String PbtxGroNo;
    @JsonProperty("ElecPayNo")
    private String ElecPayNo;
    @JsonProperty("PmntYmd")
    private String PmntYmd;
    @JsonProperty("PryFlnm")
    private String PryFlnm;
}
