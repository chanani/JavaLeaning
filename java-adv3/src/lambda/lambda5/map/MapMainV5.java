package lambda.lambda5.map;

import lambda.lambda5.filter.GenericFilter;

import java.util.List;

public class MapMainV5 {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "orange");

        // String -> String
        List<String> upperFruits = GenericMapper.map(fruits, s -> s.toUpperCase());
        System.out.println("upperFruits = " + upperFruits);

        // String -> Integer
        List<Integer> lengthFruits = GenericMapper.map(fruits, s -> s.length());
        System.out.println("lengthFruits = " + lengthFruits);

        // Integer -> String // repeat -> 같은 문자를 count수 만큼 붙여서 반환
        List<Integer> integers = List.of(1, 2, 3);
        List<String> startList = GenericMapper.map(integers, n -> "*".repeat(n));
        System.out.println("startList = " + startList);

    }

}
