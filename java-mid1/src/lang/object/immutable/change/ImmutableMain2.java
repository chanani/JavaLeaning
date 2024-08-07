package lang.object.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20); // 반환값을 설정하지 않을 경우 return 값을 버림

        System.out.println("obj1 = " + obj1.getValue());

    }
}
