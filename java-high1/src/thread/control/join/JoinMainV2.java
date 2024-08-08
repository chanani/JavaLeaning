package src.thread.control.join;

import static src.util.ThreadUtils.sleep;
import static util.MyLogger.log;

public class JoinMainV2 {

    public static void main(String[] args) {
        log("start");
        SumTast task1 = new SumTast(1, 50);
        SumTast task2 = new SumTast(51, 100);
        Thread thread1 = new Thread(task1, "thread-1");
        Thread thread2 = new Thread(task2, "thread-2");

        thread1.start();
        thread2.start();

        // sleep을 통해 연산을 위해 메인 스레드 잠시 멈추기
        // 정확한 타이밍을 맞추어 기다리기 어려움
        log("main thread sleep()");
        sleep(3000);
        log("main thread 깨어남");


        log("task1.result = " + task1.result);
        log("task2.result = " + task2.result);

        int sumAll = task1.result + task2.result;
        log("task1 + task2 = " + sumAll);

        log("end");
    }

    static class SumTast implements Runnable {
        int startValue;
        int endValue;
        int result = 0;

        public SumTast(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            log("작업 시작");
            sleep(2000);
            int sum = 0;
            for (int i = startValue; i <= endValue; i++) {
                sum += i;
            }
            result = sum;
            log("작업 완료 result = " + result);
        }
    }
}
