package ch07_loops;

import java.util.Scanner;

/*
    몇 줄의 별을 찍겠습니까? >>> 3
    ***
    **
    *
 */

public class LoopEx07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 줄의 별을 찍고 싶은가요? >>> ");
        int starNum = scanner.nextInt();

        for(int i = starNum; i > 0; i--) {
            for(int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}