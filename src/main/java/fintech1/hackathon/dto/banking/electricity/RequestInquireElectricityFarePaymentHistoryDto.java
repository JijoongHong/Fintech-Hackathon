package fintech1.hackathon.dto.banking.electricity;

import com.fasterxml.jackson.annotation.JsonProperty;
import fintech1.hackathon.dto.banking.HeaderDto;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class RequestInquireElectricityFarePaymentHistoryDto {
    @JsonProperty("Header")
    private HeaderDto headerDto = new HeaderDto("InquireElectricityFarePaymentHistory", "13E_001_00");
    @JsonProperty("ElecPayNo")
    private String ElecPayNo = "2632001709000428753"; //전자납부번호
    @JsonProperty("PageNo")
    private String PageNo = "1"; //페이지
    @JsonProperty("Insymd")
    private String Insymd = "20191108"; //시작일
    @JsonProperty("Ineymdo")
    private String Ineymdo = "20191108"; //종료일
}
