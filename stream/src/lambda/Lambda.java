package lambda;

public class Lambda {

    public static void main(String[] args) {
        /**
         * 참고 블로그 : https://mangkyu.tistory.com/113
         *
         * 람다의 특징
         *   - 람다식 내에서 사용되는 지역변수는 final이 붙지 않아도 상수로 간주한다.
         *   - 람다식으로 선언된 변수명은 다른 변수명과 중복될 수 없다.
         *
         */

        // 람다식을 이용한 익명 함수
        MyLambdaFunction lambdaFunction = (int a, int b) -> a > b ? a : b;
        System.out.println("result = " + lambdaFunction.max(3, 5));

    }
}

@FunctionalInterface
interface MyLambdaFunction {
    int max(int a, int b);
}