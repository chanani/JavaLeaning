package nested.test;

public class OuterClassMain1 {

    public static void main(String[] args) {
        // 중첩 클래스
        OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass();
        nestedClass.hello();
    }
}
