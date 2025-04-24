package ch08_method;

import java.util.Scanner;

public class Method03 {
    /* 실행 예
        몇 과목의 점수를 입력하시겠습니까? >>> 3
        1과목의 점수를 입력하세요 >>>
        2과목의 점수를 입력하세요 >>>
        3과목의 점수를 입력하세요 >>>
        총 합은 285.0이며, 평균은 95.0입니다.
     */

    public static void calculateAvgScore(int count) {
        Scanner scanner = new Scanner(System.in);

        double sum  = 0;
        double avgScore = 0;

        for(int i = 0; i < count; i++) {
            System.out.print((i + 1) + "과목의 점수를 입력하세요 >>> ");
            sum += scanner.nextDouble();
        }

        avgScore = sum / count;

        System.out.println("총 합은 " + sum + "이며, 평균은 " + avgScore + "입니다.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfSubs = 0;

        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>> ");
        numOfSubs = scanner.nextInt();

        calculateAvgScore(numOfSubs);
    }
}
