package thread.start;

import static util.MyLogger.log;

// 람다로 Runnable 만들기
public class InnerRunnableMainV4 {

    public static void main(String[] args) {
        log("main() start");

        // 단축키 option + command + n
        Thread thread = new Thread(() -> log("run()"));
        thread.start();

        log("main() end");
    }


}
