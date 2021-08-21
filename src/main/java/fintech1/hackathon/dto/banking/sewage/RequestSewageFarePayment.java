package fintech1.hackathon.dto.banking.sewage;

import com.fasterxml.jackson.annotation.JsonProperty;
import fintech1.hackathon.dto.banking.HeaderDto;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
public class RequestSewageFarePayment {
    @JsonProperty("Header")
    private HeaderDto headerDto;
    @JsonProperty("PbtxGroNo")
    private String PbtxGroNo = "1004102"; //지로번호
    @JsonProperty("PbtxInstClasCd")
    private String PbtxInstClasCd = "26"; //공과금 기관분류코드
    @JsonProperty("PbtxPytxno")
    private String PbtxPytxno = "2632017557510042632000017091002"; //공과금납세번호
    @JsonProperty("PbtxElcrPmntNo")
    private String PbtxElcrPmntNo = "263201755751004"; //공과금 전자납부번호
    @JsonProperty("Acno")
    private String Acno = "3020000000071"; //계좌번호
    @JsonProperty("PayRcrdSbjcCntn")
    private String PayRcrdSbjcCntn = "주택관리공단"; //납부기록사항
    @JsonProperty("Tram")
    private String Tram = "733120"; //거래금액
    @JsonProperty("Isnm")
    private String Isnm = "부산광역시"; //기관명
    @JsonProperty("TmpmWthnDay")
    private String TmpmWthnDay = "20191130"; //납기내일자
    @JsonProperty("PryNm")
    private String PryNm = "홍길남"; //납부자명
    @JsonProperty("TxitNm")
    private String TxitNm = "상하수도요금"; //세목명
}
