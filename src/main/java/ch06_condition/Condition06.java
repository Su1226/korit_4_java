package ch06_condition;

import java.util.Scanner;

/*
    삼항 연산자 : 조건식을 평가하여 true / false에 따라 두 가지 표현식 중 하나를 선택적으로 실행.

    - 형식 : 조건식 ? 표현식1 : 표현식2

    조건식 : true / false로 평가 가능한 식
    표현식1 : 조건식이 true일 때 실행되는 식
    표현식2 : 조건식이 false일 때 실행되는 식
 */

public class Condition06 {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        int max, max2;

        // 삼항 연산자를 사용할 때
        max = (a > b) ? a : b;
        System.out.println("max의 값은 : " + max);

        // if를 사용할 때
        if(a > b) {
            max2 = a;
        } else {
            max2 = b;
        }
        System.out.println("max의 값은 : " + max2);
    }
}
