package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream 생성
 */
public class StreamApiExample1 {

    public static void main(String[] args) {

        /**
         * Collection의 Stream 생성
         *
         * Collection 인터페이스에는 stream() 메서드가 정의되어 있기 때문에, Collection 인터페이스를 구현한 객체들(List,Set 등)은
         * 모두 이 메소드를 이용해 Stream을 생성할 수 있다.
         * stream()을 사용하면 해당 Collection의 객체를 소스로 하는 Stream을 반환한다.
         */

        // List로부터 스트림을 생성
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.stream();

        /**
         * 배열의 Stream 생성
         *
         * 배열의 원소들은 소스로하는 Stream을 생성하기 위해서는 Stream.of() 메서드 또는 Arrays.stream() 메서드를 사용하면 된다.
         */

        // 배열로부터 스트림을 생성
        Stream<String> stream1 = Stream.of("a", "b", "c");
        Stream<String> stream2 = Stream.of(new String[]{"a", "b", "c"});
        Stream<String> stream3 = Arrays.stream(new String[]{"a", "b", "c"});
        Stream<String> stream4 = Arrays.stream(new String[]{"a", "b", "c"}, 0, 3); // end 범위 포함 X

        /**
         * 원시 Stream 생성
         *
         * 위와 같이 객체를 위한 Stream 외에도 int와 long 그리고 double과 같은 원시 자료형들을 사용하기 위한 특수한 종류의
         * Stream(IntStream, LongStream, DoubleStream) 들도 사용할 수 있으며,Intstream같은 경우 range()함수를 사용하여 기존의 for문을 대체할 수 있다.
         */

        // 4 이상 10 이하의 숫자를 갖는 intStream
        IntStream intStream = IntStream.range(4, 10);
        intStream.forEach(System.out::println);


    }
}
