package fintech1.hackathon.dto.banking;

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
    private String ApiNm; //api 이름
    private String Tsymd; //오늘 날짜 MMyyDD
    private String Trtm; // 현재 시간 HHMMSS
    private String Iscd = "001059"; // 기관코드
    private String FintechApsno = "001"; // 001 기본
    private String ApiSvcCd =  "ReceiveTranferA";
    private String isTuno; // 거래번호(난수생성)
    private String AccessToken = "d3f92a5b17ea32069a3ede2bd8a964a520e55902032c2a36f34754d310454659";

    public HeaderDto(String ApiNm) {
        this.ApiNm = ApiNm;
        String now = LocalDateTime.now().toString();
        this.Tsymd = now.split("T")[0].replaceAll("-", "");
        this.Trtm = now.split("T")[1].replaceAll(":", "").split(".")[0];
        String random = "";
        for (int i = 0; i<20;i++){
            char ch = (char)((int)(Math.random()*25)+97);
            random += ch;
        }
        this.isTuno = random;
    }
}
