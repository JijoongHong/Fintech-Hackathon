package fintech1.hackathon.dto.banking.sewage;

import com.fasterxml.jackson.annotation.JsonProperty;
import fintech1.hackathon.dto.banking.HeaderDto;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
public class RequestInquireSewageFarePaymentDto {
    @JsonProperty("Header")
    private HeaderDto headerDto = new HeaderDto("InquireSewageFarePayment", "13E_002_00");
    @JsonProperty("ElecCsmrNo")
    private String ElecCsmrNo = "263201755751004"; //전자수용가번호
    @JsonProperty("Acno")
    private String Acno = "3020000000071"; //계좌번호
    @JsonProperty("PageNo")
    private String PageNo = "1"; //페이지번호
}
