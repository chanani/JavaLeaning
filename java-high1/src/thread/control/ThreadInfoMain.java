package src.thread.control;


import src.thread.start.HelloRunnable;

import static util.MyLogger.log;

public class ThreadInfoMain {

    public static void main(String[] args) {
        // main 스레드
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        //log("mainThread.threadId() = " + mainThread.threadId());
        log("mainThread.threadId() = " + mainThread.getId());
        log("mainThread.getName() = " + mainThread.getName());
        // 우선 순위 기본이 5, 높을 수록 많이 실행됨
        log("mainThread.getPriority() = " + mainThread.getPriority());
        log("mainThread.getThreadGroup() = " + mainThread.getThreadGroup());
        // 실행 중이거나 실행될 준비가 된 상타 RUNNABLE, 시작 전일 경우 NEW 등 블로그 참고
        log("mainThread.getState() = " + mainThread.getState());

        // myThread의 부모 Thread는 main Thread
        // myThread 는 mainThread를 통해 생성되었기 때문
        // 그룹은 부모 Thread의 그룹
        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread = " + myThread);
        log("myThread.threadId() = " + myThread.getId());
        log("myThread.getName() = " + myThread.getName());
        log("myThread.getPriority() = " + myThread.getPriority());
        log("myThread.getThreadGroup() = " + myThread.getThreadGroup());
        log("myThread.getState() = " + myThread.getState());

    }
}
