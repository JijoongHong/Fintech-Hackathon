package fintech1.hackathon.feign;

import fintech1.hackathon.dto.banking.balance.InquireBalanceDto;
import fintech1.hackathon.dto.banking.balance.RequestInquireBalanceDto;
import fintech1.hackathon.dto.banking.electricity.*;
import fintech1.hackathon.dto.banking.history.InquireTransactionHistoryDto;
import fintech1.hackathon.dto.banking.history.RequestInquireTransactionHistoryDto;
import fintech1.hackathon.dto.banking.register.CheckOpenFinAccountDirectDto;
import fintech1.hackathon.dto.banking.register.OpenFinAccountDirectDto;
import fintech1.hackathon.dto.banking.register.RequestCheckOpenFinAccountDirectDto;
import fintech1.hackathon.dto.banking.register.RequestOpenFinAccountDirectDto;
import fintech1.hackathon.dto.banking.sewage.*;
import fintech1.hackathon.dto.banking.transfer.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "feign", url="https://developers.nonghyup.com")
public interface OpenBankingFeign {

    @PostMapping(path = "/OpenFinAccountDirect.nh")
    public OpenFinAccountDirectDto requestOpenFinAccountDirect(@RequestBody RequestOpenFinAccountDirectDto requestOpenFinAccountDirectDto);

    @PostMapping(path = "/CheckOpenFinAccountDirect..nh")
    public CheckOpenFinAccountDirectDto requestCheckOpenFinAccountDirect(@RequestBody RequestCheckOpenFinAccountDirectDto requestCheckOpenFinAccountDirectDto);

    @PostMapping(path="/InquireBalance.nh")
    public InquireBalanceDto requestInquireBalance(@RequestBody RequestInquireBalanceDto requestInquireBalanceDto);

    @PostMapping(path = "/DrawingTransfer.nh")
    public DrawingTransferDto requestDrawingTransfer(@RequestBody RequestDrawingTransferDto requestDrawingTransferDto);

    @PostMapping(path = "/ReceivedTransferAccountNumbe.nh")
    public ReceivedTransferAccountNumberDto requestReceivedTransferAccountNumber(@RequestBody RequestReceivedTransferAccountNumberDto requestReceivedTransferAccountNumberDto);

    @PostMapping(path = "/ReceivedTransferOtherBank.nh")
    public ReceivedTransferOtherBankDto requestReceivedTransferOtherBank(@RequestBody RequestReceivedTransferOtherBankDto requestReceivedTransferOtherBankDto);

    @PostMapping(path = "/InquireTransactionHistory.nh")
    public InquireTransactionHistoryDto requestInquireTransactionHistory(@RequestBody RequestInquireTransactionHistoryDto requestInquireTransactionHistoryDto);

    @PostMapping(path = "/SewageFarePayment.nh")
    public SewageFarePaymentDto requestSewageFarePayment(@RequestBody RequestSewageFarePaymentDto requestSewageFarePaymentDto);

    @PostMapping(path = "/InquireSewageFarePayment.nh")
    public InquireSewageFarePaymentDto requestInquireSewageFarePayment(@RequestBody RequestInquireSewageFarePaymentDto requestInquireSewageFarePaymentDto);

    @PostMapping(path = "/InquireSewageFarePaymentHistory.nh")
    public InquireSewageFarePaymentHistoryDto requestInquireSewageFarePaymentHistory(@RequestBody RequestInquireSewageFarePaymentHistoryDto requestInquireSewageFarePaymentHistoryDto);

    @PostMapping(path = "/InquireElectricityFarePayment.nh")
    public InquireElectricityFarePaymentDto requestInquireElectricityFarePayment(@RequestBody RequestInquireElectricityFarePaymentDto requestInquireElectricityFarePaymentHistoryDto);

    @PostMapping(path = "/ElectricityFarePayment.nh")
    public ElectricityFarePaymentDto requestElectricityFarePayment(@RequestBody RequestElectricityFarePaymentDto requestElectricityFarePaymentDto);

    @PostMapping(path = "/InquireElectricityFarePaymentHistory.nh")
    public InquireElectricityFarePaymentHistoryDto requestInquireElectricityFarePaymentHistory(@RequestBody RequestInquireElectricityFarePaymentHistoryDto requestInquireElectricityFarePaymentHistoryDto);
}
