package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<Dog>();
        Box<Cat> catBox = new Box<Cat>();

        dogBox.set(new Dog("멍멍이", 100));

        WildcardEx.printGenericV1(dogBox);

        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printWildcardV2(dogBox);

        WildcardEx.printGenericV2(dogBox);


        Dog dog = WildcardEx.printANdReturnGeneric(dogBox);

        Cat cat = WildcardEx.printANdReturnGeneric(catBox);

        Animal animal = WildcardEx.printANdReturnWildcard(dogBox);

    }
}
