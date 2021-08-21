package fintech1.hackathon.dto.banking.history;

import com.fasterxml.jackson.annotation.JsonProperty;
import fintech1.hackathon.dto.banking.HeaderDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@Getter
@Setter
public class RequestInquireTransactionHistoryDto {
    @JsonProperty("Header")
    private HeaderDto headerDto = new HeaderDto("InquireTransactionHistory");
    @JsonProperty("Bncd")
    private String Bncd = "011"; //은행코드
    @JsonProperty("Acno")
    private String Acno; //계좌번호
    @JsonProperty("Insymd")
    private String Insymd = LocalDate.now().toString().replaceAll("-", "").substring(0,6) + "01"; //시작일
    @JsonProperty("Ineymdo")
    private String Ineymdo = LocalDate.now().toString().replaceAll("-", ""); //종료일
    @JsonProperty("Lnsq")
    private String Lnsq = "ASC"; //정렬순서 ASC(오름차순) DESC(내림차순)
    @JsonProperty("PageNo")
    private String PageNo = "1"; //페이지
    @JsonProperty("Dmcnt")
    private String Dmcnt = "100"; //페이지 당 갯수

    public RequestInquireTransactionHistoryDto(String acno) {
        Acno = acno;
    }
}
