package ch07_loops;

public class LoopEx03 {
    public static void main(String[] args) {
        // 1부터 100까지 중 홀수 합을 구하는 for문을 작성하시오.

        int sum1 = 0;

        for (int i = 0; i < 101; i++) {
            if(i % 2 == 1) {
                sum1 += i;
            }
        }

        System.out.println(sum1);

        int sum2 = 0;
        for (int i = 1; i < 101; i+=2) {
            sum2 += i;
        }

        System.out.println(sum2);
    }
}
