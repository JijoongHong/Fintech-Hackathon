package fintech1.hackathon.dto.banking;

import lombok.Data;

import java.util.List;
@Data
public class InquireSewageFarePaymentHistoryDto {
    private String TotCnt;
    private String PageNo;
    private String IqtCnt;
    private String CtntDataYn;
    private List<SewageFareHistoryDto> rec;
}
