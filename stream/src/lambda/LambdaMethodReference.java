package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaMethodReference {

    public static void main(String[] args) {

        /**
         * 메서드 참조(Method Reference)
         * 함수형 인터페이스를 람다식이 아닌 일반 메서드를 참조시켜 선언하는 방법입니다. 일반 메서드를 참조하기 위해서는 다음의 3가지 조건을 만족시켜야합니다.
         * 1. 함수형 인터페이스의 매개변수 타입 = 메서드의 매개변수 타입
         * 2. 함수형 인터페이스의 매개변수 개수 = 매서드의 매개변수 개수
         * 3. 함수형 인터페이스의 반환형 = 메서드의 반환형
         *
         * 참조 가능한 메서드는 일반 메서드, Static 메서드, 생성자가 있으며 [클래스이름::메서드이름] 으로참조할 수 있다.
         */

        /**
         * 1. 일반 메서드 참조
         * - 매개변수 없음
         * - 매개변수 개수 = 0개
         * - 반환형 = int
         */
        System.out.println("---------일반 메서드 참조---------");

        // 기존의 람다식
        Function<String, Integer> functionDefault = (str) -> str.length();
        Integer functionDefaultResult = functionDefault.apply("Hello World");

        // 메소드 참조로 변경
        Function<String, Integer> function = String::length;
        Integer functionResult = function.apply("Hello World");

        System.out.println("functionDefaultResult = " + functionDefaultResult);
        System.out.println("functionResult = " + functionResult);

        // 일반 메소드를 참조하여 Consumer를 선언한다.
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello World!!");

        // 메소드 참조를 통해 Consumer를 매개변수로 받는 forEach를 쉽게 사용할 수 있다.
        List<String> list = Arrays.asList("red", "orange", "yellow", "green", "blue");
        list.forEach(System.out::println);


        /**
         * 2. Static 메서드 참조
         */
        System.out.println("---------Static 메서드 참조---------");

        Predicate<Boolean> predicate = Objects::isNull;
        boolean predicateResult = predicate.test(null);
        System.out.println("predicateResult = " + predicateResult);


        /**
         * 3. 생성자 참조
         * 생성자는 new로 생성해주므로 클래스이름::new로 참조할 수 있다.
         * Supplier는 매개변수가 없이 반환값만을 갖는 인터페이스이기 때문에,
         * 매개변수 없이 String 객체를 새롭게 생성하는 String의 생성자를 참조하여 Supplier로 선언할 수 있다.
         */
        System.out.println("---------생성자 참조---------");

        Supplier<String> supplier = String::new;
        System.out.println("supplier = " + supplier);

    }


}
