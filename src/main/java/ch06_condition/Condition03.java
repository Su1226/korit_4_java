package ch06_condition;
/*
    if - else if 문 : if - else문과 달리, else if에는 별도의 조건식이 요구된다.
                      else if의 개수에는 제한이 없다.

    - 형식
        if(조건식) {
            실행문;
            실행문;
            ...
        } else if(조건식) {
            실행문;
            실행문;
            ...
        } else if (조건식) {
            실행문;
            실행문;
            ...
        } else {
            실행문;
            ...
        }
 */

import java.util.Scanner;

public class Condition03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int point = 0;
        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;

        // final 키워드가 붙은 변수나 상수는 재대입이 불가능하다.
        // 즉 변함없는 데이터를 사용하고 싶을 때 사용되는데,
        // 변함없는 데이터라는 것을 알아볼 수 있기 쉽게 모두 대문자로 쓰며, snake 표기법을 사용한다.

        System.out.print("회원 포인트를 입력하세요 >>> ");
        point = scanner.nextInt();

//        if(point >= VIP_POINT) {
//            System.out.println("회원 등급 : VIP");
//        } else if (point >= GOLD_POINT) {
//            System.out.println("회원 등급 : GOLD");
//        } else if (point >= SILVER_POINT) {
//            System.out.println("회원 등급 : SILVER");
//        } else if (point > BRONZE_POINT) {
//            System.out.println("회원 등급 : BRONZE");
//        } else if (point <= BRONZE_POINT) {
//            System.out.println("회원 등급 : NOMAL");
//        } else {
//            System.out.println("회원이 없습니다.");
//        }

        // 위 코드는 리터럴을 너무 많이 사용되었다.
        // 반복되는 부분이 많아 줄이도록 한다.
        // 등급을 저장하는 변수를 선언한다.
        String userGrade = "";

        if(point >= VIP_POINT) {
            userGrade = "VIP";
        } else if (point >= GOLD_POINT) {
            userGrade = "GOLD";
        } else if (point >= SILVER_POINT) {
            userGrade = "SILVER";
        } else if (point > BRONZE_POINT) {
            userGrade = "BRONZE";
        } else if (point <= BRONZE_POINT) {
            userGrade = "NOMAL";
        } else {
            userGrade = "NO";
        }

        System.out.println("회원 등급 : " + userGrade);
        // if - else / if - else if문 경우, 전체가 한 세트의 주건문으로 볼 필요가 있다.
    }
}
