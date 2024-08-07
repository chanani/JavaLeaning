package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar){
        // 지역 변수
        int localVar = 1;

        // 익명 클래스
        // Printer interface를 구현하는 익명 클래스를 생성
        // 익명 클래스는 부모 클래스를 상속 받거나, 인터페이스를 구현해야 됩니다.
        Printer printer = new Printer(){
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };
        printer.print();
        System.out.println("printer.class = " + printer.getClass());
    }
 
    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
