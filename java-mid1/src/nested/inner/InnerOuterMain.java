package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        // 중첩은 $로 구분
        System.out.println("innerClass = " + inner.getClass());

    }
}
