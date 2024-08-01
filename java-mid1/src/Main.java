public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

//        String result = "";
//        for (int i = 0; i < 100000; i++) {
//            result += "hihihihihi";
//        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("hihihihihi");
        }
        String result = sb.toString();
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime + "ms");

    }
}