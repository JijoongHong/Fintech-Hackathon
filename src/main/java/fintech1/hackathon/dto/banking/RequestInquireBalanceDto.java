package fintech1.hackathon.dto.banking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class RequestInquireBalanceDto {
    private HeaderDto headerDto;
    private String FinAcno;
}
