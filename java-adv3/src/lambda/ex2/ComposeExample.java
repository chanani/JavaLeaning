package lambda.ex2;

public class ComposeExample {

    public static MyTransFormer compose(MyTransFormer upper, MyTransFormer deco) {
        return s -> {
            String transUpper = upper.transform(s);
            String transDeco = deco.transform(transUpper);
            return transDeco;
        };
    }

    public static void main(String[] args) {
        MyTransFormer toUpper = s -> s.toUpperCase();

        MyTransFormer addDeco = s -> "**" + s + "**";

        MyTransFormer composeFunc = compose(toUpper, addDeco);

        String result = composeFunc.transform("hello");
        System.out.println("result = " + result);
    }
}
