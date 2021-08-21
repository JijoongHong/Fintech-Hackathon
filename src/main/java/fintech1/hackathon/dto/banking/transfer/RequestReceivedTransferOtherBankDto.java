package fintech1.hackathon.dto.banking.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import fintech1.hackathon.dto.banking.HeaderDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class RequestReceivedTransferOtherBankDto {
    @JsonProperty("Header")
    private HeaderDto headerDto;
    @JsonProperty("Bncd")
    private String Bncd = "011"; //은행코드
    @JsonProperty("Acno")
    private String Acno; //계좌번호
    @JsonProperty("Tram")
    private String Tram; //거래금액
    //@JsonProperty("DractOtlt")
    //private String DractOtlt; //출금계좌인자내용
    @JsonProperty("MractOtlt")
    private String MractOtlt; //입금계좌인자내용

}
