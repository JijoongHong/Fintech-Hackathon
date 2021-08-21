package fintech1.hackathon.dto.banking.electricity;

import com.fasterxml.jackson.annotation.JsonProperty;
import fintech1.hackathon.dto.banking.HeaderDto;
import lombok.*;

@Data
@Getter
@Setter
public class RequestInquireElectricityFarePaymentDto {
    @JsonProperty("Header")
    private HeaderDto headerDto = new HeaderDto("InquireElectricityFarePayment");
    @JsonProperty("ElecPayNo")
    private String ElecPayNo="0606628088"; //은행코드
    @JsonProperty("Acno")
    private String Acno="3020000000071"; //계좌번호
}
