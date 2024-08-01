package nested.anonymous.ex;

import java.util.Random;

public class Ex1Main {

    public static int helloDice(){
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("주사위 : " + randomValue);
        // 코드 조각 종료

        System.out.println("프로그램 종료");
        return randomValue;
    }

    public static void helloSum(int randomValue){
        System.out.println("프로그램 시작");
        int sum = 0;
        // 코드 조각 시작
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + randomValue);
            sum += randomValue;
        }
        // 코드 조각 종료
        System.out.println("sum = " + sum);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloSum(helloDice());
    }
}
