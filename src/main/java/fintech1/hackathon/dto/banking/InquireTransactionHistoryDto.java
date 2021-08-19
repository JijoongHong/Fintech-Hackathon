package fintech1.hackathon.dto.banking;

import lombok.Data;

import java.util.List;
@Data
public class InquireTransactionHistoryDto {
    private String CtntDataYn;
    private String TopCnt;
    private String Iqtcnt;
    private List<AccountDto> Rec;
}
