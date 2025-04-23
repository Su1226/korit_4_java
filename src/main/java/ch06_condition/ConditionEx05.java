package ch06_condition;

import java.util.Scanner;

public class ConditionEx05 {
    public static void main(String[] args) {
        /*
            ConditionEx01 파일에서 점수를 출력하는 코드를 작성했다.
            이를 응용하여 중첩 if문 + switch문 형태로 프로그램을 작성한다.

            지시사항
            사용자에게 score를 입력 받아서 다음과 같은 조건을 만족시키도록 작성하라.
            score가 0미만이거나 100초과라면 grade = x

            changedScore = 9~10, grade = A
            changedScore = 8, grade = B
            changedScore = 7, grade = C
            changedScore = 6, grade = D
            changedScore = 5,4,3,2,1, grade = F

            실행 예
            점수를 입력하세요 >>> 100
            점수는 100점이고, 학점은 A입니다.

            changedScore = score / 10;
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요 >>> ");

        int score = scanner.nextInt();
        int changedScore = score / 10;
        String grade = "";

        if(changedScore < 0 || changedScore > 10) {
            grade = "x";
        } else {
            switch (changedScore) {
                case 9, 10 :
                    grade = "A";
                    break;
//                case 10 :                 // switch의 특성을 사용하여
//                case 9 :                  // case10과 9는 같기 때문에 바로 10과 9는 모두 A로 나온다.
//                    grade = "A";
//                    break;
                case 8 :
                    grade = "B";
                    break;
                case 7 :
                    grade = "C";
                    break;
                case 6 :
                    grade = "D";
                    break;
                default :
                    grade = "F";

            }
        }

        System.out.println("점수는 " + score + "점 이고, 학점은 " + grade + "입니다.");
    }
}
