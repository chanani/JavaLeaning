package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object =  GenericMethod.objMethod(i);
        // Integer result = (Integer) GenericMethod.objMethod(i); // 형변환을 해줘야함

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("타입인자 명시적 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer IntegerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);


        // 제네릭 메서드 타입 추론
        Integer result2 = GenericMethod.genericMethod(i);
        Integer IntegerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);
    }
}
