package fintech1.hackathon.dto.banking;

import lombok.Data;

import java.util.List;
@Data
public class InquireElectricityFarePaymentHistoryDto {
    private String IqtCnt;
    private String CtntDataYn;
    private String TotCnt;
    private String PageNo;
    private List<ElectricityFareHistoryDto> rec;
}
