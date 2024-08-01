package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {

    public static void main(String[] args) {
        // 날짜와 시간 조회하기
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        // 년도 조회하기
        System.out.println("YEAR = " + dt.get(ChronoField.YEAR));
        // 월 조회하기
        System.out.println("MONTH_OF_YEAR = " + dt.get(ChronoField.MONTH_OF_YEAR));
        // 일 조회하기
        System.out.println("DAY_OF_MONTH = " + dt.get(ChronoField.DAY_OF_MONTH));
        // 시간 조회하기
        System.out.println("HOUR_OF_DAY = " + dt.get(ChronoField.HOUR_OF_DAY));
        // 분 조회하기
        System.out.println("MINUTE_OF_HOUR = " + dt.get(ChronoField.MINUTE_OF_HOUR));
        // 초 조회하기
        System.out.println("SECOND_OF_MINUTE = " + dt.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("편의 메서드 제공");

        // 년도 조회하기
        System.out.println("YEAR = " + dt.getYear());
        // 월 조회하기
        System.out.println("MONTH_OF_YEAR = " + dt.getMonthValue());
        // 일 조회하기
        System.out.println("DAY_OF_MONTH = " + dt.getDayOfMonth());
        // 시간 조회하기
        System.out.println("HOUR_OF_DAY = " + dt.getHour());
        // 분 조회하기
        System.out.println("MINUTE_OF_HOUR = " + dt.getMinute());
        // 초 조회하기
        System.out.println("SECOND_OF_MINUTE = " + dt.getSecond());

        System.out.println("편의 메서드에 없음");
        // 하루에 있는 시간
        System.out.println("MINUTE_OF_DAY = " + dt.get(ChronoField.MINUTE_OF_DAY));
        // 하루의 초
        System.out.println("SECOND_OF_DAY = " + dt.get(ChronoField.SECOND_OF_DAY));

    }


}
