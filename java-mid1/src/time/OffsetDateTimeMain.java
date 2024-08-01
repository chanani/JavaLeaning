package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {

    public static void main(String[] args) {
        // ZoneId가 없기 때문에 일광 절약 시간제가 적용되지 않는다.
        // 현재 날짜 + 시간 + offset
        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println("nowOdt = " + nowOdt);

        LocalDateTime ldt = LocalDateTime.of(2023, 1, 1, 13, 30, 50);
        System.out.println("ldt = " + ldt);

        // 시간 변경
        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
        System.out.println("odt = " + odt);

    }
}
