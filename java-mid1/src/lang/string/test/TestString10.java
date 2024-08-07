package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] arr = fruits.split(",");
        for (String fruit : arr) {
            System.out.println(fruit);
        }
        String joinedString = String.join("->", arr);

        System.out.println("result = " + joinedString);
    }
}
