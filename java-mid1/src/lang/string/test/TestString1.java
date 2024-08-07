package lang.string.test;

public class TestString1 {

    public static void main(String[] args) {
        String url = "https://222.example.com";
        boolean result = url.startsWith("https//");
        System.out.println("result = " + result);
    }
}
