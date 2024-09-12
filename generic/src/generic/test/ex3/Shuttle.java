package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

import java.util.ArrayList;

public class Shuttle<T extends BioUnit> {

    private T unit;

    public void in(T t){
        unit = t;
    }

    public T out(){
        return unit;
    }

    public void showInfo(){
        System.out.println("이름 : " + unit.getName() + ", hp : " + unit.getHp());
    }
}
