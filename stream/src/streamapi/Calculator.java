package streamapi;

import java.util.Arrays;
import java.util.List;

public class Calculator {

    public static void main(String[] args) {
        /**
         * 참고 블로그 : https://mangkyu.tistory.com/112
         * 참고 영상 : https://www.youtube.com/watch?v=4ZtKiSvZNu4
         *
         * [중간 연산]
         * distinct() : 중복제거
         * filter() : 조건에 맞는 요소만 추출
         * sorted() : 요소 정렬
         * map() : 요소 변환, 특정 요소만 추출
         * flatMap() : 여러개의 스트림을 하나의 스트림으로 만들어줌
         *
         * [최종 연산]
         * forEach() : 스트림의 데이터를 소모하여 주로 출력하는 용도로 사용
         * allMatch() : 모든 요소가 true인지 확인
         * anyMatch() : 하나라도 true인지 확인
         * noneMatch() : 모든 요소가 false인지 확인
         * findFirst() : 조건에 일치하는 첫번째 요소 반환
         * findAny() : 조건에 일치하는 요소를 하나 반환
         * collect() : 스트림의 요소를 수집
         *  - collect(Collector collector)
         *      - 스트림의 최종 연산
         *      - Collector 파라미터로 받음
         *  - Collector
         *      - 인터페이스
         *      - Collector를 구현해야 collect의 파마리터로 사용할 수 있음
         *  - Collectors
         *      - 이미 정의된 컬렉터를 static 메서드로 제공하는 클래스
         *   [빈도가 높은 메서드]
         *   - collect(Collectors.toList()) : List로 변환
         *   - collect(Collectors.toMap()) :
         *   - collect(Collectors.groupingBy()) : 분류 함수를 인자로 받아서 데이터를 그룹화하여 맵을 반환
         *   - collect(Collectors.joining()) : 데이터를 연결하여 반환
         *   - collect(Collectors.reduce()) : 데이터를 줄여 나가면서 연산을 수행하고 최종 결과를 반환
         */

        /**
         * 1. 생성하기
         * 2. 가공하기
         * 3. 결과 만들기
         */

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        long result = myList.stream()                            // 생성하기
                .filter(s -> s.startsWith("c"))            // 가공하기
                .map(String::toUpperCase)            // 가공하기
                .sorted()                            // 가공하기
                .count();// 결과만들기

        System.out.println("결과 = " + result);
    }

}
