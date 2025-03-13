package streamapi;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream 가공(중간 연산)
 */
public class StreamApiExample2 {

    public static void main(String[] args) {

        /**
         * 필터링 - filter()
         *
         * Filter는 Stream에서 조건에 맞는 데이터만을 정제하여 더 작은 컬렉션을 만들어내는 연산이다.
         */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
        Stream<String> streamFilter = list.stream()
                .filter(name -> name.contains("a"));

        /**
         * 데이터 변환 - map()
         *
         * map은 기존의 Stream 요소들을 변환하여 새로운 Stream을 형성하는 연산이다.
         * map 함수의 인자로 함수형 인터페이스 function을 받고 있다.
         */
        Stream<String> streamMap = list.stream()
                .map(name -> name.toUpperCase());
        Stream<File> fileStream = Stream.of(new File("Test1.java"), new File("Test2.java"), new File("Test3.java"));


        /**
         * 정렬 - sorted()
         *
         * Stream의 요소들을 정렬하기 위해서는 sorted를 사용해야 하며, 파라미터로 Comparator를 넘길 수도 있다.
         * Comparator 인자 없이 호출할 경우에는 오름차순으로 정렬이 되며, 내림차순으로 정렬하기 위해서는 Comparator의 reverseOrder를 이용하면 된다.
         */

        List<String> sortList = Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift");
        Stream<String> streamSorted = sortList.stream()
                .sorted();

        Stream<String> streamSortedReverse = sortList.stream()
                .sorted(Comparator.reverseOrder());


        /**
         * 중복제거 - distinct()
         *
         * Stream의 요소들에 중복된 데이터가 존재하는 경우, 중복을 제거하기 위해 distinct를 사용할 수 있다.
         * distinct는 중복된 데이터를 검사하기 위해 Object의 equals() 메소드를 사용한다.
         * 만약 우리가 생성한 클래스를 Stream으로 사용한다고 하면 equals와 hashCode를 오버라이드 해야만 distinct()를 제대로 적용할 수 있다.
         */

        List<String> distinctList = Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift", "Java");
        Stream<String> distinctResult = distinctList.stream().distinct();


        /**
         * 원시 Stream <-> stream 변환
         *
         * mapToInt(), mapToLong(), mapToDouble()이라는 특수한 Mapping 연산을 지원하고 있으며,
         * 그 반대로 원시객체는 mapToObject를 통해 일반적인 Stream 객체로 바꿀 수 있다.
         */

        // IntStream -> Stream<String>
        IntStream.range(1, 4)
                .mapToObj(i -> "a" + i);

        // Stream<Double> -> IntStream -> Stream<String>
        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "a" + i);


    }
}
