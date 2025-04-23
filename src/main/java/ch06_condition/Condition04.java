package ch06_condition;

import java.util.Scanner;

/*
    ( if - else if - else ) 문
    if(조건식1) {
    } else if(조건식2) {
        실행문1;
    } else if(조건식3) {
        실행문2;
    } else if(조건식4) {
        실행문3;
    } else {
        실행문4;
    }

    조건식은 순차적으로 조건식을 확인하기 때문에, 순서가 위에서 아래로 정해져 있다.
    그리고 조건식에 걸리지 않은 경우에 else가 실행된다.
    때문에 조건식의 순서를 잘 생각해야 함.
 */

public class Condition04 {
    public static void main(String[] args) {

        int point = 0;
        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;
        String userGrade = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("회원 포인트를 입력하세요 >>> ");
        point = scanner.nextInt();

        if(point >= VIP_POINT) {
            userGrade = "VIP";
        } else if (point >= GOLD_POINT) {
            userGrade = "GOLD";
        } else if (point >= SILVER_POINT) {
            userGrade = "SILVER";
        } else if (point > BRONZE_POINT) {
            userGrade = "BRONZE";
        } else {
            userGrade = "NOMAL";
        }

        System.out.println("회원 등급 : " + userGrade);
    }
}
