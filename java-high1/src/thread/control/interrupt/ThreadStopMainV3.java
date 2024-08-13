package src.thread.control.interrupt;

import static src.util.ThreadUtils.sleep;
import static util.MyLogger.log;

public class ThreadStopMainV3 {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(100); // 시간을 줄임
        log("작업 중단 지시 thread.interrupt()");
        thread.interrupt();
        log("work 스데르 인터럽트 상태 1 = " + thread.isInterrupted());


    }

    static class MyTask implements Runnable {

        // volatile = 여러 스레드에서 공유하는 값에 사용 하는 키워드
        volatile boolean runFlag = true;

        @Override
        public void run() {
            while(!Thread.currentThread().isInterrupted()){ // 인터럽트 상태 변경 X
                log("작업중");
            }
            log("work 스레드 인터럽트 상태2 = " + Thread.currentThread().isInterrupted());

            try {
                log("자원 정리");
                Thread.sleep(1000); // InterruptedException 발생
                log("자원 종료");
            } catch (InterruptedException e) {
                log("자원 정리 실패 - 자원 정리 즁 인터럽트 발생");
                log("work 스레드 인터럽트 상태3 = " + Thread.currentThread().isInterrupted());
            }
            log("작업 종료");
        }
    }
}
