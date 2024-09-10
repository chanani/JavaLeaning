package generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj){
        System.out.println("obj print = " + obj);
        return obj;
    }

    // 제네릭 메서드
    public static <T> T genericMethod(T t){
        System.out.println("generic print = " + t);
        return t;
    }

    // 제네릭 extends 설정
    public static <T extends Number> T numberMethod(T t){
        System.out.println("bound print = " + t);
        return t;
    }
}
