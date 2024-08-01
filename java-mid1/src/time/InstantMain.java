package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        // 1970년 01월 01일(UTC) 부터 현재까지 경고된 시간을 초 단위로 표현한 것
        // 일반으로 날짜와 시간을 사용할 떄는 LocalDateTime, ZonedDateTime 등을 사용하면되고 Instant는 특정한 경우에만 사용

        // 생성
        Instant now = Instant.now(); // UTC기준
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        // 1970년 01월 01일에 0초를 더한 것
        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);
        
        // 조회 epoch로 부터 흐른 시간
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
