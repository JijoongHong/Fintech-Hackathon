package fintech1.hackathon.dto.banking;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

@Data
@Getter
@Setter
public class HeaderDto {
    @JsonProperty("ApiNm")
    private String ApiNm; //api 이름
    @JsonProperty("Tsymd")
    private String Tsymd; //오늘 날짜 MMyyDD
    @JsonProperty("Trtm")
    private String Trtm; // 현재 시간 HHMMSS
    @JsonProperty("Iscd")
    private String Iscd = "001059"; // 기관코드
    @JsonProperty("FintechApsno")
    private String FintechApsno = "001"; // 001 기본
    @JsonProperty("ApiSvcCd")
    private String ApiSvcCd;
    @JsonProperty("IsTuno")
    private String IsTuno; // 거래번호(난수생성)
    @JsonProperty("AccessToken")
    private String AccessToken = "d3f92a5b17ea32069a3ede2bd8a964a520e55902032c2a36f34754d310454659";

    public HeaderDto(String ApiNm, String ApiSvcCd) {
        this.ApiNm = ApiNm;
        this.ApiSvcCd = ApiSvcCd;
        String now = LocalDateTime.now().toString();
        this.Tsymd = now.split("T")[0].replaceAll("-", "");
        this.Trtm = now.split("T")[1].replaceAll(":", "").substring(0,6);
        String random = "";
        for (int i = 0; i<20;i++){
            char ch = (char)((int)(Math.random()*25)+97);
            random += ch;
        }
        this.IsTuno = random;
    }
}
