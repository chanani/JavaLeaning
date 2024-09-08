package src.thread.start;

import static util.MyLogger.log;

// 익명 클래스로 변수 만들지 않고 Runnable 만들기
public class InnerRunnableMainV3 {

    public static void main(String[] args) {
        log("main() start");

        // 단축키 option + command + n
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                log("run()");
            }
        });
        thread.start();

        log("main() end");
    }


}
