package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {

    public static void main(String[] args) {
        // LocalDate는 년, 월, 일의 정보만 있기 때문에 시, 분, 초에 대한 정보를 가져올 수 없다.
        // 시, 분, 초를 조회하려고 하면 에러가 발생한다.
        // 조회하기 전 isSupported()　메서드를 통해 가능한지 알아보자, IsSupportedMain2 클래스에서 자세히 알아보자.
        LocalDate now = LocalDate.now();
        int minute = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("minute = " + minute);
    }
}
