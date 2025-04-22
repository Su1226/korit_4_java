package ch04_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.println("올해는 몇 년도인가요? ");
        year = scanner.nextInt();

        System.out.println(year + "년도 입니다.");

    }
}
