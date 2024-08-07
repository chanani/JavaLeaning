package thread.start;


// Runnable 인터페이스를 상속 받아 사용
public class HelloRunnable implements Runnable{


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : run()");
    }
}
