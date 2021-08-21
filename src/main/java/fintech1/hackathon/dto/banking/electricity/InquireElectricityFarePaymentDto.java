package fintech1.hackathon.dto.banking.electricity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class InquireElectricityFarePaymentDto {
    @JsonProperty("ElecPayNo")
    private String ElecPayNo;
    @JsonProperty("MmbrFlnm")
    private String MmbrFlnm;
    @JsonProperty("PbtxGroNo")
    private String PbtxGroNo;
    @JsonProperty("PbtxBrnNm")
    private String PbtxBrnNm;
    @JsonProperty("CustInqNo")
    private String CustInqNo;
    @JsonProperty("TaxtYm")
    private String TaxtYm;
    @JsonProperty("Tram")
    private String Tram;
    @JsonProperty("PbtxPayExdt")
    private String PbtxPayExdt;
    @JsonProperty("NtfFrmt")
    private String NtfFrmt;
    @JsonProperty("IssShp")
    private String IssShp;
    @JsonProperty("Etc")
    private String Etc;
    @JsonProperty("PbtxTmpmDsnc")
    private String PbtxTmpmDsnc;

}
