package src.thread.control.join;

import static src.util.ThreadUtils.sleep;
import static util.MyLogger.log;

public class JoinMainV4 {

    public static void main(String[] args) throws InterruptedException {
        log("start");
        SumTast task1 = new SumTast(1, 50);
        Thread thread1 = new Thread(task1, "thread-1");

        thread1.start();

        // 스레드가 종료될 때 까지 대기
        // join에 시간(ms) 전달하면 특정 시간만큼 기다릴 수 있음
        log("join(1000) - mian thread가 thread1이 종료될 때까지 대기");
        thread1.join(1000);
        log("main thread 대기 완료");


        log("task1.result = " + task1.result);


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
