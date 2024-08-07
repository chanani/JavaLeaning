package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
        // 중첩 클래스는 바깥클래스.중첩클래스로 접근 가능
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        // 안쪽에 있는 클래스는 $로 구분
        System.out.println("nestedClass = " + nested.getClass());
    }
}
