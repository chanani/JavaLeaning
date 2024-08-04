package thread.start;

public class HelloThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " : main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + " : start() 호출 전");
        // start()를 통해서 스레드 작동
        // start()를 호출하면 Thread-0 스레드가 시작되면서 Thread-0 스레드가 run() 메서드를 호출한다.
        // main 스레드가 아닌 Thread-0이 run()을 호출하는 것
        // main 스레드가 기다려주지 않는다. 그래서 순서가 보장되지 않는다.
        helloThread.start();
        System.out.println(Thread.currentThread().getName() + " : start() 호출 후");

        System.out.println(Thread.currentThread().getName() + " : main() end");
    }
}
