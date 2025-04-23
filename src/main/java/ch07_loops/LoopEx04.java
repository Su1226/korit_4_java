package ch07_loops;

import java.util.Scanner;

public class LoopEx04 {
    public static void main(String[] args) {
        /*
            숫자를 입력 받아 1부터 n까지 더하는 반복문을 작성하라.

            실행 예
            1부터 몇까지 더하시겠습니까? >>> 10
            1부터 10까지의 합은 55입니다.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("1부터 몇까지 더하시겠습니까? >>> ");
        int n = scanner.nextInt();
        int sum = 0;

        for(int i = 0; i <= n; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
