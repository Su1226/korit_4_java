package ch06_condition;

import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 논리 연산자
        System.out.print("연도를 입력하세요 >>> ");
        int year = scanner.nextInt();
        String leapYear = "";

        if ((year % 4 == 0 && year != 100) || (year % 400 == 0)) {
            leapYear = "윤년입니다.";
        } else {
            leapYear = "윤년이 아닙니다.";
        }

        System.out.println(year + "년도는 " + leapYear);
    }
}
