package ch08_method;

/*
    bmi 계산기를 method를 정의하고 실행시켜라.
    메소드명 : calculateBmi()
    retur type : void
    매개변수 유무 : 없음

    bmi_체질량지수는 자신의 몸무게(kg)를 키의 제곱(m)으로 나눈 값입니다.
 */

import java.util.Scanner;

public class MethodEx02 {

    public static void calculatieBmi() {
     /* 실행 예
        키(cm)를 입력하세요 >>> 172.5
        몸무게(kg)를 입력하세요 >>> 68.7
        당신의 BMI 지수는 23.08이고 과체중입니다.
      */
        Scanner scanner = new Scanner(System.in);

        double yourCm;
        double yourKg;
        double yourBmi;
        String yourType;

        System.out.print("키(cm)를 입력하세요 >>> ");
        yourCm = scanner.nextDouble() / 100;
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        yourKg = scanner.nextDouble();

        yourBmi =  yourKg / (yourCm * yourCm);

        if(yourBmi > 25.0) {
            yourType = "비만";
        } else if (yourBmi > 23) {
            yourType = "과체중";
        } else if (yourBmi > 18.5) {
            yourType = "정상";
        } else {
            yourType = "저체중";
        }

        System.out.println("당신의 BMI 지수는 " + yourBmi + "이고, " + yourType + " 입니다.");
    }

    public static void main(String[] args) {
        calculatieBmi();
    }
}
