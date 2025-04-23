package ch06_condition;

/*
    과제
    : 윤년 계산기 작성
    윤년(leap year)은 특정 조건을 만족하는 년도를 의미한다.

    윤년을 판단하는 규칙은
    1. 연도로 4로 나누어 떯어지는 해는 윤년에 해당할 '수도 있음'
    2. 그러나 100으로 나누어 떨어지는 해는 윤년이 아님
    3. 근데 100으로 나누어 떨어지긴 하는데 400으로도 떨어지면 윤년에 해당함. \

    예를 들어,
    2020년은 4로 나누어 떨어지므로 윤년이다. (100으로 나누어떨어지지 않는다.)
    1900년은 100으로 나누어 떨어지기 때문에 윤년이 아니다. (400으로 나누어 떨어지지 않음.)
    2000년은 100으로 나누어 떨어지지만 400으로 나누어 떨어지므로 윤년에 해당한다.
 */

import java.util.Scanner;

public class ConditionEx03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        String leapYear = "";

        System.out.print("연도를 입력하세요. >>> ");
        year = scanner.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            if(year <= 0) {
                leapYear = "윤년이 아닙니다.";
            }

            leapYear = "윤년입니다.";
        } else {
            leapYear = "윤년이 아닙니다.";
        }

        System.out.println(year + "년도는 " + leapYear);
    }
}
