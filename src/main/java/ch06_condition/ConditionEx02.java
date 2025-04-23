package ch06_condition;

import java.util.Scanner;


public class ConditionEx02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        String grade;

        System.out.print("당신의 점수를 입력하세요 >>> ");
        score = scanner.nextInt();


        // 잠재적 문제점 : 100이상, 0이하일 때 각각 A와 F를 줄 것이다.
        // 즉 우리가 생각한 만점 100 이상을 넘은 수도 받아들이고, - 점수도 받아들인다는 것,


        if(score >=90 && score <=100) {
            grade = "A";
        } else if(score >= 80) {
            grade = "B";
        } else if(score >= 70) {
            grade = "C";
        } else if(score >= 60) {
            grade = "D";
        } else if (score >= 50) {
            grade = "F ";
        }

        // System.out.println("당신의 점수는 " + score + "점 이고, 학점은 " + grade + " 입니다.");
    }
}
