package fintech1.hackathon.dto.banking.history;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AccountHistoryDto {
    @JsonProperty("Trdd")
    private String Trdd;
    @JsonProperty("Txtm")
    private String Txtm;
    @JsonProperty("MnrcDrotDsnc")
    private String MnrcDrotDsnc;
    @JsonProperty("Tram")
    private String Tram;
    @JsonProperty("aftrBlnc")
    private String aftrBlnc;
    @JsonProperty("TrnsAfAcntBlncSmblCd")
    private String TrnsAfAcntBlncSmblCd;
    @JsonProperty("Smr")
    private String Smr;
    @JsonProperty("HnisCd")
    private String HnisCd;
    @JsonProperty("HnbrCd")
    private String HnbrCd;
    @JsonProperty("Ccyn")
    private String Ccyn;
    @JsonProperty("Tuno")
    private String Tuno;
    @JsonProperty("BnprCntn")
    private String BnprCntn;

}
