package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaMethod {

    public static void main(String[] args) {

        System.out.println("---------Supplier---------");
        /**
         * Supplier<T>
         * Supplier는 매개변수 없이 반환 값 만을 갖는 함수형 인터페이스다.
         * Supplier는 T get()을 추상 메서드로 갖고 있다.
         */


        Supplier<String> supplier = () -> "Hello world";
        System.out.println("supplier result = " + supplier.get());


        System.out.println("---------Consumer---------");
        /**
         * Consumer<T>
         * Consumer는 객체 T를 매개변수로 받아서 사용하며, 반환 값은 없다.
         * Consumer는 void accept(T t)를 추상 메서드로 갖고 있다.
         * andThen() 메서드를 사용하여 Consumer를 연쇄적으로 연결할 수 있다.
         */

        Consumer<String> consumer = (str) -> System.out.println(str.split(" ")[0]);
        consumer.andThen(System.out::println).accept("Hello world");


        System.out.println("---------Function---------");
        /**
         * Function<T, R>
         * Functiondms 객체 T를 받아서 처리한 후 R로 반환한다.
         * Function은 R apply(T t)를 추상 메서드로 갖고 있다.
         * Function은 Consumer와 마찬가지로 andThen을 제공하고 있으며, 추가적으로 compose를 제공하고 있다.
         */

        Function<String, Integer> function = str -> str.length();
        Integer functionResult = function.apply("Hello world");
        System.out.println("function result = " + functionResult);


        System.out.println("---------Predicate---------");
        /**
         * Predicate<T>
         * Predicate는 객체 T를 받아서 boolean을 반환한다.
         * Predicate는 boolean test(T t)를 추상 메서드로 갖고 있다.
         */

        Predicate<String> predicate = (str) -> str.equals("Hello world");
        boolean predicateResult = predicate.test("Hello world");
        System.out.println("predicate result = " + predicateResult);

    }
}
