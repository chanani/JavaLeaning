package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        // <> 빼고 만들 수 있다. 지정하지 않을 시 Object로 생성
        GenericBox integerBox = new GenericBox();
        // GenericBox<Object> IntegerBox = new GenericBox<>(); // 권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
