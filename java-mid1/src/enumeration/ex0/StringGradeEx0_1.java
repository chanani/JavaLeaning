package enumeration.ex0;

public class StringGradeEx0_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        System.out.println("BASIC 등금의 할인 급액 : " + basic);
        System.out.println("GOLD 등금의 할인 급액 : " + gold);
        System.out.println("DIAMOND 등금의 할인 급액 : " + diamond);

    }
}
