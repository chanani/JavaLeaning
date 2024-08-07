package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] arr = email.split("@");
        System.out.println("ID = " + arr[0]);
        System.out.println("Domain = " + arr[1]);
    }
}
