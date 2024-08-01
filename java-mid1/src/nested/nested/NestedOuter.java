package nested.nested;

public class NestedOuter {
    // 정적 중첩 클래스 예제
    private static int outClassValue = 3;
    public int outInstanceValue = 2; // static이 붙지 않은 변수를 인스턴스 멤버라고 합니다.

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스에 멤버에는 접근할 수 없다.
            // System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다.
            // 같은 클래스 내부에 있기 때문에 private도 접근 가능
            //System.out.println(NestedOuter.outClassValue);
            System.out.println(outClassValue);
        }
    }
}
