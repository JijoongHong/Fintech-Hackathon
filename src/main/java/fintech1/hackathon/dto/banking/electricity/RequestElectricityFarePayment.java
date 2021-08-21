package fintech1.hackathon.dto.banking.electricity;

import com.fasterxml.jackson.annotation.JsonProperty;
import fintech1.hackathon.dto.banking.HeaderDto;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
public class RequestElectricityFarePayment {
    @JsonProperty("Header")
    private HeaderDto headerDto = new HeaderDto("ElectricityFarePayment");
    @JsonProperty("PbtxGroNo")
    private String PbtxGroNo = "0420007"; //지로번호
    @JsonProperty("CustInqNo")
    private String CustInqNo = "19014601060662808823"; //전자납부번호
    @JsonProperty("ElecPayNo")
    private String ElecPayNo = "0606628088"; //고객조회번호
    @JsonProperty("TaxtYm")
    private String TaxtYm = "201909"; //과세년월
    @JsonProperty("NtfFrmt")
    private String NtfFrmt = "0"; //고지년월
    @JsonProperty("IssShp")
    private String IssShp = "4"; //고지형태
    @JsonProperty("Etc")
    private String Etc = "01"; //발행형태
    @JsonProperty("Tram")
    private String Tram = "9230"; //거래금액
    @JsonProperty("Acno")
    private String Acno = "3020000000071"; //계좌번호
    @JsonProperty("Tlno")
    private String Tlno = "01012345678"; //전화번호
    @JsonProperty("MmbrRrno")
    private String MmbrRrno = "9912311234567"; //주민번호
    @JsonProperty("PryFlnm")
    private String PryFlnm = "홍길남"; //이름
    @JsonProperty("TrSbjcSrchNm")
    private String TrSbjcSrchNm = "주택관리공단"; //기록사항
}

