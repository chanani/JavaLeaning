package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str = "hello";
        String str2 = str.concat(" java");
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        // format method
        // %d는 숫자, %b는 boolean, %s는 문자열을 뜻한다.
        String format1 = String.format("num : %d, bool : %b, str: %s", 100, true, "java");
        System.out.println(format1);
        String format2 = String.format("숫자 : %.2f", 10.1234);
        System.out.println(format2);

        // printf
        System.out.printf("숫자 : %2f\n", 10.1234);


    }
}
