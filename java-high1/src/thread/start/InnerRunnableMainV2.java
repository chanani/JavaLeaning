package src.thread.start;

import static util.MyLogger.log;

// 익명 클래스로 Runnable 만들기
public class InnerRunnableMainV2 {

    public static void main(String[] args) {
        log("main() start");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                log("run()");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        log("main() end");
    }


}
