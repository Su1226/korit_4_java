package ch06_condition;
/*
    조건문
    1. if문 : if 다음에 있는 () 내의 조건식이 true일 때 {} 내의 실행문이 실행된다. 즉, false면 실행되지 않음.
        - 형식
          if (조건식) {    // 조건식 : true / false로 결론이 날 수 있는 식 또는 문장
                실행문;
                실행문;
                ....
          } else if (조건식) {
                실행문;
                실행문;
                ...
          } else {
                실행문;
                ...
          }
    2.
 */

import java.util.Scanner;

public class Condition01 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int num1 = 10;

        if(num1 > 0) {
            System.out.println("num1은 양수입니다.");
        } // true -> 실행 o

        if(num1 > 15) {
            System.out.println("num1은 15보다 작습니다.");
        } // false -> 실행 x

        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 >>> ");
        int num2 = scanner.nextInt();

        if(num2 > 0) {
            System.out.println("num2는 양수입니다.");
        } else {
            System.out.println("num2는 음수입니다.");
        }
    }
}
