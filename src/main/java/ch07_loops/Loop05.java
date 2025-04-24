package ch07_loops;

/*
    for(int i = 0; i < 10; i++) {
        반복 실행문1_a
        for(int j = 0; j < 10; j++) {
            반복 실행문2
        }
        (반복 실행문1_b) // 있을 수도 있고, 없을 수도 있다.
        for(int k = 0; k < 10; k++) {
            반복 실행문3
        }
        (반복 실행문1_c)

        for 문으로 별 출력하기
        *
        **
        ***
        ****
        *****
 */

import java.util.Scanner;

public class Loop05 {
    public static void main(String[] args) {
        // 순차적이로 별 찍기
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 거꾸로 별 찍기
        for(int i = 5; i > 0; i--) {
            for(int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < 5; i++) {
            for(int j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 줄의 별을 찍고 싶은가요? >>> ");
        int starNum = scanner.nextInt();

        for(int i = 0; i<starNum; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
