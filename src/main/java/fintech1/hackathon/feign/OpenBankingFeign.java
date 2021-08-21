package fintech1.hackathon.feign;

import fintech1.hackathon.dto.banking.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "feign", url="https://developers.nonghyup.com")
public interface OpenBankingFeign {

    @PostMapping(path = "/OpenFinAccountDirect.nh")
    public OpenFinAccountDirectDto requestOpenFinAccountDirect(
            @RequestHeader(name = "apiName", defaultValue = "OpenFinAccountDirect") String apiName,
            @RequestHeader("Tsymd") String Tsymd,
            @RequestHeader("Trtm") String Trtm,
            @RequestHeader(name = "Iscd", defaultValue = "001059") String Iscd,
            @RequestHeader(name = "FintechApsno", defaultValue = "001") String FintechApsno,
            @RequestHeader("APISvcCd") String APISvcCd,
            @RequestHeader("Istuno") String Istuno,
            @RequestHeader(name = "AccessToken", defaultValue = "d3f92a5b17ea32069a3ede2bd8a964a520e55902032c2a36f34754d310454659") String AccessToken,
            @RequestParam(name = "DrtrRgyn", defaultValue = "Y") String DrtrRgyn,
            @RequestParam("BrdtBrno") String BrdtBrno,
            @RequestParam("Bncd") String Bncd,
            @RequestParam("Acno") String Acno
    );

    @PostMapping(path = "/CheckOpenFinAccountDirect..nh")
    public CheckOpenFinAccountDirectDto requestCheckOpenFinAccountDirect(
            @RequestHeader(name = "apiName", defaultValue = "CheckOpenFinAccountDirect") String apiName,
            @RequestHeader("Tsymd") String Tsymd,
            @RequestHeader("Trtm") String Trtm,
            @RequestHeader(name = "Iscd", defaultValue = "001059") String Iscd,
            @RequestHeader(name = "FintechApsno", defaultValue = "001") String FintechApsno,
            @RequestHeader("APISvcCd") String APISvcCd,
            @RequestHeader("Istuno") String Istuno,
            @RequestHeader(name = "AccessToken", defaultValue = "d3f92a5b17ea32069a3ede2bd8a964a520e55902032c2a36f34754d310454659") String AccessToken,
            @RequestParam("Rgno") String Rgno,
            @RequestParam("BrdtBrno") String BrdtBrno
    );
    /*
    @PostMapping(path = "/InquireBalance.nh",  produces = "application/json")
    public InquireBalanceDto requestInquireBalance(
            @RequestHeader(name = "apiName",required = false, defaultValue = "InquireBalance") String apiName,
            @RequestHeader("Tsymd") String Tsymd,
            @RequestHeader("Trtm") String Trtm,
            @RequestHeader(name = "Iscd", required = false, defaultValue = "001059") String Iscd,
            @RequestHeader(name = "FintechApsno", required = false, defaultValue = "001") String FintechApsno,
            @RequestHeader("APISvcCd") String APISvcCd,
            @RequestHeader("Istuno") String Istuno,
            @RequestHeader(name = "AccessToken", required = false, defaultValue = "d3f92a5b17ea32069a3ede2bd8a964a520e55902032c2a36f34754d310454659") String AccessToken,
            @RequestParam("FinAcno") String FinAcno
    );*/


    //@PostMapping(path = "/InquireBalance.nh",  consumes = "application/json", produces = "application/json")
    @RequestMapping(path="/InquireBalance.nh", method = {RequestMethod.POST}, consumes = "application/json", produces = "application/json")
    public InquireBalanceDto requestInquireBalance(@RequestBody RequestInquireBalanceDto requestInquireBalanceDto);


    @PostMapping(path = "/DrawingTransfer.nh")
    public DrawingTransferDto requestDrawingTransfer(
            @RequestHeader(name = "apiName", defaultValue = "DrawingTransfer") String apiName,
            @RequestHeader("Tsymd") String Tsymd,
            @RequestHeader("Trtm") String Trtm,
            @RequestHeader(name = "Iscd", defaultValue = "001059") String Iscd,
            @RequestHeader(name = "FintechApsno", defaultValue = "001") String FintechApsno,
            @RequestHeader("APISvcCd") String APISvcCd,
            @RequestHeader("Istuno") String Istuno,
            @RequestHeader(name = "AccessToken", defaultValue = "d3f92a5b17ea32069a3ede2bd8a964a520e55902032c2a36f34754d310454659") String AccessToken,
            @RequestParam("FinAcno") String FinAcno,
            @RequestParam("Tram") String Tram,
            @RequestParam("MractOtlt") String MractOtlt
    );

    @PostMapping(path = "/ReceivedTransferAccountNumbe.nh")
    public ReceivedTransferAccountNumberDto requestReceivedTransferAccountNumber(
            @RequestHeader(name = "apiName", defaultValue = "ReceivedTransferAccountNumber") String apiName,
            @RequestHeader("Tsymd") String Tsymd,
            @RequestHeader("Trtm") String Trtm,
            @RequestHeader(name = "Iscd", defaultValue = "001059") String Iscd,
            @RequestHeader(name = "FintechApsno", defaultValue = "001") String FintechApsno,
            @RequestHeader("APISvcCd") String APISvcCd,
            @RequestHeader("Istuno") String Istuno,
            @RequestHeader(name = "AccessToken", defaultValue = "d3f92a5b17ea32069a3ede2bd8a964a520e55902032c2a36f34754d310454659") String AccessToken,
            @RequestParam("Bncd") String Bncd,
            @RequestParam("Acno") String Acno,
            @RequestParam("Tram") String Tram,
            @RequestParam("MractOtlt") String MractOtlt
    );

    @PostMapping(path = "/ReceivedTransferOtherBank.nh")
    public ReceivedTransferOtherBankDto requestReceivedTransferOtherBank(
            @RequestHeader(name = "apiName", defaultValue = "ReceivedTransferOtherBank") String apiName,
            @RequestHeader("Tsymd") String Tsymd,
            @RequestHeader("Trtm") String Trtm,
            @RequestHeader(name = "Iscd", defaultValue = "001059") String Iscd,
            @RequestHeader(name = "FintechApsno", defaultValue = "001") String FintechApsno,
            @RequestHeader("APISvcCd") String APISvcCd,
            @RequestHeader("Istuno") String Istuno,
            @RequestHeader(name = "AccessToken", defaultValue = "d3f92a5b17ea32069a3ede2bd8a964a520e55902032c2a36f34754d310454659") String AccessToken,
            @RequestParam("Bncd") String Bncd,
            @RequestParam("Acno") String Acno,
            @RequestParam("Tram") String Tram,
            @RequestParam("MractOtlt") String MractOtlt
            );

    @PostMapping(path = "/InquireTransactionHistory.nh")
    public InquireTransactionHistoryDto requestInquireTransactionHistory(
            @RequestHeader(name = "apiName", defaultValue = "InquireTransactionHistory") String apiName,
            @RequestHeader("Tsymd") String Tsymd,
            @RequestHeader("Trtm") String Trtm,
            @RequestHeader(name = "Iscd", defaultValue = "001059") String Iscd,
            @RequestHeader(name = "FintechApsno", defaultValue = "001") String FintechApsno,
            @RequestHeader("APISvcCd") String APISvcCd,
            @RequestHeader("Istuno") String Istuno,
            @RequestHeader(name = "AccessToken", defaultValue = "d3f92a5b17ea32069a3ede2bd8a964a520e55902032c2a36f34754d310454659") String AccessToken,
            @RequestParam("Bncd") String Bncd,
            @RequestParam("Acno") String Acno,
            @RequestParam("Insymd") String Insymd,
            @RequestParam("Insymd") String Ineymd,
            @RequestParam("Dmcnt") String Dmcnt
    );

    @PostMapping(path = "/SewageFarePayment.nh")
    public SewageFarePaymentDto requestSewageFarePayment(
            @RequestHeader(name = "apiName", defaultValue = "SewageFarePayment") String apiName,
            @RequestHeader("Tsymd") String Tsymd,
            @RequestHeader("Trtm") String Trtm,
            @RequestHeader(name = "Iscd", defaultValue = "001059") String Iscd,
            @RequestHeader(name = "FintechApsno", defaultValue = "001") String FintechApsno,
            @RequestHeader("APISvcCd") String APISvcCd,
            @RequestHeader("Istuno") String Istuno,
            @RequestHeader(name = "AccessToken", defaultValue = "d3f92a5b17ea32069a3ede2bd8a964a520e55902032c2a36f34754d310454659") String AccessToken,
            @RequestParam(name = "PbtxGroNo", defaultValue = "1004102") String PbtxGroNo,
            @RequestParam(name = "PbtxInstClasCd", defaultValue = "26") String PbtxInstClasCd,
            @RequestParam(name = "PbtxPytxno", defaultValue = "2632017557510042632000017091002") String PbtxPytxno,
            @RequestParam(name = "PbtxElcrPmntNo", defaultValue = "2632001709000428753") String PbtxElcrPmntNo,
            @RequestParam(name = "Acno", defaultValue = "3020000000071") String Acno,
            @RequestParam(name = "PayRcrdSbjcCntn", defaultValue = "주택관리공단") String PayRcrdSbjcCntn,
            @RequestParam(name = "Tram", defaultValue = "733120") String Tram,
            @RequestParam(name = "Isnm", defaultValue = "부산광역시") String Isnm,
            @RequestParam(name = "TmpmWthnDay", defaultValue = "20191130") String TmpmWthnDay,
            @RequestParam(name = "PryNm", defaultValue = "홍길남") String PryNm,
            @RequestParam(name = "TxitNm", defaultValue = "상하수도요금") String TxitNm
    );

    @PostMapping(path = "/InquireSewageFarePaymentHistory.nh")
    public InquireSewageFarePaymentHistoryDto requestInquireSewageFarePaymentHistory(
            @RequestHeader(name = "apiName", defaultValue = "InquireSewageFarePaymentHistory") String apiName,
            @RequestHeader("Tsymd") String Tsymd,
            @RequestHeader("Trtm") String Trtm,
            @RequestHeader(name = "Iscd", defaultValue = "001059") String Iscd,
            @RequestHeader(name = "FintechApsno", defaultValue = "001") String FintechApsno,
            @RequestHeader("APISvcCd") String APISvcCd,
            @RequestHeader("Istuno") String Istuno,
            @RequestHeader(name = "AccessToken", defaultValue = "d3f92a5b17ea32069a3ede2bd8a964a520e55902032c2a36f34754d310454659") String AccessToken,
            @RequestParam(name = "ElecPayNo", defaultValue = "2632001709000428753") String ElecPayNo,
            @RequestParam(name = "PageNo", defaultValue = "1") String PageNo,
            @RequestParam(name = "Insymd", defaultValue = "20191108") String Insymd,
            @RequestParam(name = "Ineymd", defaultValue = "20191108") String Ineymd);

    @PostMapping(path = "/InquireElectricityFarePayment.nh")
    public InquireElectricityFarePaymentDto requestInquireElectricityFarePayment(
            @RequestHeader(name = "apiName", defaultValue = "InquireElectricityFarePayment") String apiName,
            @RequestHeader("Tsymd") String Tsymd,
            @RequestHeader("Trtm") String Trtm,
            @RequestHeader(name = "Iscd", defaultValue = "001059") String Iscd,
            @RequestHeader(name = "FintechApsno", defaultValue = "001") String FintechApsno,
            @RequestHeader("APISvcCd") String APISvcCd,
            @RequestHeader("Istuno") String Istuno,
            @RequestHeader(name = "AccessToken", defaultValue = "d3f92a5b17ea32069a3ede2bd8a964a520e55902032c2a36f34754d310454659") String AccessToken,
            @RequestParam(name = "ElecPayNo", defaultValue = "0606628088") String ElecPayNo,
            @RequestParam(name = "Acno", defaultValue = "3020000000071") String Acno
    );

    @PostMapping(path = "/ElectricityFarePayment.nh")
    public ElectricityFarePaymentDto requestElectricityFarePayment(
            @RequestHeader(name = "apiName", defaultValue = "ElectricityFarePayment") String apiName,
            @RequestHeader("Tsymd") String Tsymd,
            @RequestHeader("Trtm") String Trtm,
            @RequestHeader(name = "Iscd", defaultValue = "001059") String Iscd,
            @RequestHeader(name = "FintechApsno", defaultValue = "001") String FintechApsno,
            @RequestHeader("APISvcCd") String APISvcCd,
            @RequestHeader("Istuno") String Istuno,
            @RequestHeader(name = "AccessToken", defaultValue = "d3f92a5b17ea32069a3ede2bd8a964a520e55902032c2a36f34754d310454659") String AccessToken,
            @RequestParam(name = "PbtxGroNo", defaultValue = "0420007") String PbtxGroNo,
            @RequestParam(name = "ElecPayNo", defaultValue = "0606628088") String ElecPayNo,
            @RequestParam(name = "CustInqNo", defaultValue = "19014601060662808823") String CustInqNo,
            @RequestParam(name = "TaxtYm", defaultValue = "201909") String TaxtYm,
            @RequestParam(name = "NtfFrmt", defaultValue = "0") String NtfFrmt,
            @RequestParam(name = "IssShp", defaultValue = "4") String IssShp,
            @RequestParam(name = "Etc", defaultValue = "01") String Etc,
            @RequestParam(name = "Tram", defaultValue = "9230") String Tram,
            @RequestParam(name = "Acno", defaultValue = "3020000000071") String Acno,
            @RequestParam(name = "Tlno", defaultValue = "01012345678") String Tlno,
            @RequestParam(name = "MmbrRrno", defaultValue = "9912311234567") String MmbrRrno,
            @RequestParam(name = "PryFlnm", defaultValue = "홍길남") String PryFlnm,
            @RequestParam(name = "TrSbjcSrchNm", defaultValue = "주택관리공단") String TrSbjcSrchNm
            );

    @PostMapping(path = "/InquireElectricityFarePaymentHistory.nh")
    public InquireElectricityFarePaymentHistoryDto requestInquireElectricityFarePaymentHistory(
            @RequestHeader(name = "apiName", defaultValue = "InquireElectricityFarePaymentHistory") String apiName,
            @RequestHeader("Tsymd") String Tsymd,
            @RequestHeader("Trtm") String Trtm,
            @RequestHeader(name = "Iscd", defaultValue = "001059") String Iscd,
            @RequestHeader(name = "FintechApsno", defaultValue = "001") String FintechApsno,
            @RequestHeader("APISvcCd") String APISvcCd,
            @RequestHeader("Istuno") String Istuno,
            @RequestHeader(name = "AccessToken", defaultValue = "d3f92a5b17ea32069a3ede2bd8a964a520e55902032c2a36f34754d310454659") String AccessToken,
            @RequestParam("ElecPayNo") String ElecPayNo,
            @RequestParam("PageNo") String PageNo,
            @RequestParam("Insymd") String Insymd,
            @RequestParam("Ineymd") String Ineymd);
}
