package enumeration.ex1;


public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 존자하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금애 : " + vip);

        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금애 : " + diamondd);

        // 소문자입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금애 : " + gold);

    }
}
