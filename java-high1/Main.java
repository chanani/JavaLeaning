public class Main {


    public static void main(String[] args) {

        Long start = System.currentTimeMillis();

        String b = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("asd");
        }

        Long end = System.currentTimeMillis();

        System.out.println(end - start + "ms");

    }


}
