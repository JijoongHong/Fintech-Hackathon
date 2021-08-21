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
public class RequestDrawingTransferDto {
    @JsonProperty("Header")
    private HeaderDto headerDto;
    @JsonProperty("Bncd")
    private String Bncd; //핀어카운트
    @JsonProperty("Tram")
    private String Tram; //거래금액
    @JsonProperty("DractOtlt")
    private String DractOtlt; //출금계좌인자내용
}
