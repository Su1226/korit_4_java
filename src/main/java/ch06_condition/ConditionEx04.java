package ch06_condition;

import java.util.Scanner;

public class ConditionEx04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        String leapYear = "";

        System.out.print("연도를 입력하세요. >>> ");
        year = scanner.nextInt();

        // 삼항 연산자를 이용한 윤년 계산기
//        boolean isLeapYear;
//        isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        String result = year < 0 ? "불가능한 연도입니다."
                        : (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "윤년입니다." : "평년입니다.";

        System.out.println(year + "년은 " + result);
    }
}
