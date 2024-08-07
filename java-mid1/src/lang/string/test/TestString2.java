package lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int sum = 0;
        for(String x : arr){
            System.out.println(x + ":" + x.length());
            sum += x.length();
        }
        System.out.println("sum = " + sum);
    }
}
