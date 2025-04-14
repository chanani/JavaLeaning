package lambda.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class MapExample {

    public static List<String> map(List<String> list, UnaryOperator<String> func) {
        List<String> newList = new ArrayList<>();
        for (String str : list) {
            newList.add(func.apply(str));
        }
        return newList;
    }

    public static void main(String[] args) {
        // 원본 리스트
        List<String> list = Arrays.asList("java", "hello", "lambda");
        System.out.println("원본 리스트 : " + Arrays.toString(list.toArray()));

        List<String> mapUpper = map(list, value -> value.toUpperCase());
        System.out.println("대문자 변환 결과 : " + Arrays.toString(mapUpper.toArray()));

        List<String> mapTrim = map(list, value -> "***" + value + "***");
        System.out.println("특수문자 데코 결과 : " + Arrays.toString(mapTrim.toArray()));

    }
}
