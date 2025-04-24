package ch07_loops;

import java.util.Scanner;

public class LoopEx06 {
    public static void main(String[] args) {

        // 반복 100번 할 때
        for(int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if(i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // 반복 10번 할 때
        for(int i = 1; i <= 100; i+=10) {
            System.out.print(i + " " + (i+2) + " " + (i+3) + " " + (i+4) + " "
                            + (i+5) + " " + (i+6) + " " + (i+7) + " "
                            + (i+8) + " " + (i+9) + " ");
            System.out.println();
        }
    }
}
