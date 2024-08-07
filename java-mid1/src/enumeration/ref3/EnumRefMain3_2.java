package enumeration.ref3;



public class EnumRefMain3_2 {

    public static void main(String[] args) {
        int price = 10000;
        System.out.println("BASIC 등금의 할인 급액 : " + Grade.BASIC.discount(price));
        System.out.println("GOLD 등금의 할인 급액 : " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND 등금의 할인 급액 : " + Grade.DIAMOND.discount(price));
    }
}
