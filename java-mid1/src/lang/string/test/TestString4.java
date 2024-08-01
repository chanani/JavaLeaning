package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String hello = str.substring(0,5);
        String txt = str.substring(5, 9);
        System.out.println("hello = " + hello);
        System.out.println("txt = " + txt);
    }
}
