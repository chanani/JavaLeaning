package thread.start;

public class DaemonThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " : main() start");

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); // 데몬 스레드 여부, 기본 값은 false
        daemonThread.start();

        System.out.println(Thread.currentThread().getName() + " : main() end");
        // setDaemon을 활성화 하였을 경우,user 스레드가 종료되었기에 종료
        // setDaemon 즉, 데몬 스레드가 아닐 경우 DaemonThead 클래스도 user 스레드 이기 때문에 10초 뒤 출력한 뒤 종료
    }

    static class DaemonThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " : run()");
            try {
                // 예외를 밖으로 던지지 못함, 체크 예외는 반드시 잡아야함
                Thread.sleep(10000); // 10초간 실행
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " : run() end");
        }
    }
}
