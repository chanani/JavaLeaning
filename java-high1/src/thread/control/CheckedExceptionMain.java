package src.thread.control;

import src.util.ThreadUtils;

import static src.util.ThreadUtils.sleep;

public class CheckedExceptionMain {

    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    static class CheckedRunnable implements Runnable {

        // 예외를 못던짐, 자바 문법 규칙과 맞지 않음
        // 부모 메서드가 체크 예외를 던지지 않는 경우, 재정의된 자식 메서드도 체크 예외를 던질 수 없다.
        @Override
        public void run() /*throws Exception*/ {
            // throw  new Exception(); // 주석 풀면 예외 발생
            //sleep(1000);
        }
    }

}
