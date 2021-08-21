package fintech1.hackathon.dto.banking.sewage;

import com.fasterxml.jackson.annotation.JsonProperty;
import fintech1.hackathon.dto.banking.HeaderDto;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Getter
@Setter
@NoArgsConstructor
public class RequestInquireSewageFarePaymentHistoryDto {
    @JsonProperty("Header")
    private HeaderDto headerDto;
    @JsonProperty("ElecPayNo")
    private String ElecPayNo = "2632001709000428753"; //전자납부번호
    @JsonProperty("PageNo")
    private String PageNo = "1"; //페이지
    @JsonProperty("Insymd")
    private String Insymd = "20191108"; //시작일
    @JsonProperty("Ineymdo")
    private String Ineymdo = "20191108"; //종료일
}
