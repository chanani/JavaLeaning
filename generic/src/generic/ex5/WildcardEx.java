package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    static<T> void printGenericV1(Box<T> box){
        System.out.println("T = " + box.get());
    }

    /**
     * 와일드카드 : 이미 만들어진 제네릭 타입을 편하게 활용할 때 사용한다.
     * 이것은 제네릭 메서드가 아니다. 일반적인 메서드다.
     * ?는 모든 타입을 다 받을 수 있다는 뜻이다. 즉, ? == <\? extends Object>
     */
    static void printWildcardV1(Box<?> box){
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static  void printWildcardV2(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static<T extends Animal> T printANdReturnGeneric(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    /**
     * 상한 지정을 하면 반환하는 값은 반드시 상한 타입이다. 바꿀 수 없다.
     */
    static Animal printANdReturnWildcard(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }


}
