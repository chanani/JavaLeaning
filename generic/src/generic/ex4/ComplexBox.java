package generic.ex4;

import generic.animal.Animal;

public class ComplexBox <T extends Animal> {

    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    // 제네릭 타입보다 제네릭 메서드가 높은 우선순위를 가진다. 즉, 이름이 같을 때도 메서드가 우선순위
    public <Z> Z printAndReturn(Z z){
        System.out.println("animal.className : " + animal.getClass().getName());
        System.out.println("t.className : " +  z.getClass().getName());
        return z;
    }
}
