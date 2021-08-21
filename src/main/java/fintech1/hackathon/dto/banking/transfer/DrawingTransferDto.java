package fintech1.hackathon.dto.banking.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DrawingTransferDto {
    @JsonProperty("FinAcno")
    private String FinAcno;
    @JsonProperty("RgsnYmd")
    private String RgsnYmd;
}
