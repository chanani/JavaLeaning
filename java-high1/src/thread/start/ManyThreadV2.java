package src.thread.start;

import static util.MyLogger.log;

public class ManyThreadV2 {

    public static void main(String[] args) {
        log("main() start");

        HelloRunnable runnable = new HelloRunnable();

        // thread의 실행순서는 보장되지 않는다.
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }



        log("main() end");

    }
}
