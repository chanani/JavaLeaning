package lambda.ex1;

import lambda.Procedure;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class M3MeasureTime {

    // 공통 : 실행 시간 측정 메서드
    static void measure(Procedure p) {
        long startTime = System.nanoTime();
        p.run();
        long endTime = System.nanoTime();

        System.out.println("실행 시간 : " + (endTime - startTime) + "ns");
    }

    public static void main(String[] args) {
        measure(new Procedure() {
            @Override
            public void run() {
                int N = 100;
                int sum = 0;
                for (int i = 0; i < N; i++) {
                    sum += i;
                }
                System.out.println("[1부터 " + N + "까지의 합] : 결과 : " + sum);
            }
        });

        measure(new Procedure() {
            @Override
            public void run() {
                int[] arr = {4, 3, 2, 1};
                System.out.println("원본 배열 : " + Arrays.toString(arr));
                Arrays.sort(arr);
                System.out.println("배열 정렬 : " + Arrays.toString(arr));
            }
        });
    }
}
