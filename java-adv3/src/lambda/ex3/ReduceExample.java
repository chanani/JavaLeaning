package lambda.ex3;

import lambda.ex2.MyReducer;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.ToIntBiFunction;

public class ReduceExample {

    public static int reduce(List<Integer> list, int initial, BinaryOperator<Integer> reducer) {
        int result = initial;
        for (int val : list) {
            result = reducer.apply(val, result);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println("리스트 : " + numbers);

        // 합 구하기
        int sumResult = reduce(numbers, 0, (a, b) -> a + b);
        System.out.println("누적 합 : " + sumResult);

        // 곱 구하기
        int c = reduce(numbers, 1, (a, b) -> a * b);
        System.out.println("누적 곱 = " + c);
    }

}
