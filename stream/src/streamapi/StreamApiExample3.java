package streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Stream 결과(최종 연산)
 */
public class StreamApiExample3 {

    public static void main(String[] args) {

        /**
         * 최댓값/최솟값/총합/평균/갯수 - max(), min(), sum(), average(), count()
         *
         * min이나 max 또는 average는 Stream이 비어있는 경우에 값을 특정할 수 없다. 그렇기 때문에 다음과 같이 Optional로 값이 반환된다.
         */

        OptionalInt min = IntStream.of(1, 3, 5, 7, 9).min();
        int max = IntStream.of().max().orElse(0);
        IntStream.of(1, 3, 5, 7, 9).average().ifPresent(System.out::println);
        long count = IntStream.of(1, 3, 5, 7, 9).count();
        long sum = LongStream.of(1, 3, 5, 7, 9).sum();


        /**
         * 데이터 수집 - collect()
         *
         * List나 Set, Map, 등 다른 종류의 결과로 수집하고 싶은 경우에는 collect 함수를 이용할 수 있다.
         *   - collect() : 스트림의 최종연산, 매개변수로 Collector를 필요로 한다.
         *   - Collector : 인터페이스, collect의 파라미터는 이 인터페이스를 구현해야한다.
         *   - Collectors : 클래스, static메소드로 미리 작성된 컬렉터를 제공한다.
         */

        List<Product> productList = Arrays.asList(
                new Product(23, "potatoes"),
                new Product(14, "orange"),
                new Product(13, "lemon"),
                new Product(23, "bread"),
                new Product(13, "sugar"));

        /**
         *  Collectors.toList()
         *
         *  list로 반환(해당 결과를 set으로 반환받기를 원한다면 Collectors.toSet()을 사용하면 된다.)
         */

        List<String> nameList = productList.stream()
                .map(Product::getName)
                .collect(Collectors.toList());

        /**
         * Collectors.joining()
         *
         * 결과를 1개의 문자열로 반환, 총 3개의 인자를 받을 수 있음
         * delimiter : 각 요소 사이에 들어갈 문자열, prefix : 결과 문자열의 앞에 들어갈 문자열, suffix : 결과 문자열의 뒤에 들어갈 문자열
         */

        String listToString1 = productList.stream()
                .map(Product::getName)
                .collect(Collectors.joining());

        String listToString2 = productList.stream()
                .map(Product::getName)
                .collect(Collectors.joining(" "));

        String listToString3 = productList.stream()
                .map(Product::getName)
                .collect(Collectors.joining(", ", "<", ">"));


        /**
         *   Collectors.averagingInt(), Collectors.summingInt(), Collectors.summarizingInt()
         *
         *   결과의 평균값이나 총합 등을 반환
         */
        Double averageAmount = productList.stream()
                .collect(Collectors.averagingInt(Product::getAmount));

        Integer summingAmount1 = productList.stream()
                .collect(Collectors.summingInt(Product::getAmount));

        Integer summingAmount2 = productList.stream()
                .mapToInt(Product::getAmount)
                .sum();

        // 1개의 Stream으로부터 갯수, 합계, 평균, 최댓값, 최솟값을 한번에 얻고 싶은 경우
        // Collectors.summarizingInt()를 이용하는 것이 좋다.
        //IntSummaryStatistics {count=5, sum=86, min=13, average=17.200000, max=23}
        IntSummaryStatistics statistics = productList.stream()
                .collect(Collectors.summarizingInt(Product::getAmount));


        /**
         * Collectors.groupingBy()
         *
         * 결과를 특정 그룹으로 묶기를 원할 수 있다. 이때 결과는 Map으로 반환받게 된다
         */

        Map<Integer, List<Product>> collectorMapOfLists = productList.stream()
                .collect(Collectors.groupingBy(Product::getAmount));


        /**
         * 조건 검사 - anyMatch(), allMatch(), noneMatch()
         *
         * 특정한 조건을 충족하는지 검사하고 싶은 경우에는 match 함수를 이용할 수 있다.
         */


        List<String> names = Arrays.asList("Eric", "Elena", "Java");

        boolean anyMatch = names.stream()
                .anyMatch(name -> name.contains("a"));
        boolean allMatch = names.stream()
                .allMatch(name -> name.length() > 3);
        boolean noneMatch = names.stream()
                .noneMatch(name -> name.endsWith("s"));
    }


    static class Product {
        private int amount;
        private String name;

        public Product(int amount, String name) {
            this.amount = amount;
            this.name = name;
        }

        public int getAmount() {
            return amount;
        }

        public String getName() {
            return name;
        }
    }
}
