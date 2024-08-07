package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {

    public static void main(String[] args)  {
        //NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }

            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }

            System.out.println();
        }
        System.out.println("프로그램을 정상적으로 종료합니다.");

    }

    // 공통 예외 처리
    private static void exceptionHandler(Exception e) {
        // 사용자에게 발송
        System.out.println("사용자 메시지 : 죄송합니다. 알 수 없는 문제가 발생하였습니다.");
        System.out.println("==개바자용 디버깅 메시지, 로그==");
        e.printStackTrace(System.out); // 스택 트레이스 출력, 어떤 예외가 발생했는지 확인
        //e.printStackTrace(System.err); // err로 하면 빨간색으로 출력, 출력 순서를 보장하지 않는다. 실무에서는 slf4j나 logback을 사용

        // 필요하면 예외 별로 별도의 추가 처리 가능
        if(e instanceof SendExceptionV4 sendEx){
            System.out.println("[전송 오류] 전송 데이터 :" + sendEx.getSendData());
        }
    }
}
