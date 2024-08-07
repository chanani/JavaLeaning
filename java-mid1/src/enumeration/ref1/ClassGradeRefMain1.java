package enumeration.ref1;



public class ClassGradeRefMain1 {

    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.BASIC, price);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);

        System.out.println("BASIC 등금의 할인 급액 : " + basic);
        System.out.println("GOLD 등금의 할인 급액 : " + gold);
        System.out.println("DIAMOND 등금의 할인 급액 : " + diamond);
    }
}
