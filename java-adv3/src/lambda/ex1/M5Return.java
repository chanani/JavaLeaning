package lambda.ex1;

import lambda.MyFunction;

public class M5Return {

    public static void main(String[] args) {
        MyFunction add = getOperation("add");
        MyFunction sub = getOperation("sub");
        MyFunction xxx = getOperation("xxx");

        System.out.println("add = " + add.apply(1,2));
        System.out.println("sub = " + sub.apply(1,2));
        System.out.println("xxx = " + xxx.apply(1,2));
    }

    public static MyFunction getOperation(String operator) {
        switch (operator) {
            case "add":
                return (a, b) -> a + b;
            case "sub":
                return (a, b) -> a - b;
            default:
                return (a, b) -> 0;
        }
    }
}
