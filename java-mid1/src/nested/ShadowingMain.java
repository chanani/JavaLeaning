package nested;

public class ShadowingMain {
    // 변수의 이름이 같을 때
    public int value = 1;

    class Inner {
        public int value = 2;

        void go() {
            int value = 3;
            // 지역 변수 우선 접근
            System.out.println("value = " + value);
            // 내부 클래스
            System.out.println("this.value = " + this.value);
            // 클래스
            System.out.println("ShadowingMain.value = " + ShadowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShadowingMain main = new ShadowingMain();
        Inner inner = main.new Inner();
        inner.go();

    }
}
