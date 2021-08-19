package fintech1.hackathon.dto.banking;

import lombok.Data;

import java.util.List;
@Data
public class InquireSewageFarePaymentDto {
    private String Iqtcnt;
    private String TonCnt;
    private String CtntDataYn;
    private List<SewageFareDto> rec;
}
