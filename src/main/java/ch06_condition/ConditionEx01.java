package ch06_condition;

import java.util.Scanner;

public class ConditionEx01 {
    public static void main(String[] args) {
        /*
            사용자에게 score를 입력 받아, 다음과 같은 조건을 만족시키도록 작성하시오.

            score가 90점 이상이라면 grade는 A
            score가 80점 이상이라면 grade는 B
            score가 70점 이상이라면 grade는 C
            score가 60점 이상이라면 grade는 D
            score가 59점 이하라면 grade는 F

            실행 예
            점수를 입력하세요 >>> 68
            당신의 점수는 68점이고, 학점은 D입니다.
         */

        Scanner scanner = new Scanner(System.in);
        int score;
        String grade;

        System.out.print("당신의 점수를 입력하세요 >>> ");
        score = scanner.nextInt();


        // 잠재적 문제점 : 100이상, 0이하일 때 각각 A와 F를 줄 것이다.
        // 즉 우리가 생각한 만점 100 이상을 넘은 수도 받아들이고, - 점수도 받아들인다는 것,


        if(score >=90) {
            grade = "A";
        } else if(score >= 80) {
            grade = "B";
        } else if(score >= 70) {
            grade = "C";
        } else if(score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("당신의 점수는 " + score + "점 이고, 학점은 " + grade + " 입니다.");
    }
}
