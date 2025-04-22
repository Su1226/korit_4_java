package ch04_scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        /*
            다음과 같이 콘솔에 출력될 수 있도록 코드를 작성하시오.
            점수를 입력하세요 >>> 4.5
            이름을 입력하세요 >>> 김일
            김일 학생의 점수는 4.5입니다.
         */

        // 22번 줄에서 .next()를 쓰는 버전과 .nextLine()을 쓰는 버전 2가지 작성하세요.

        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요 >>> ");
        double score = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();

//        System.out.print("점수를 입력하세요 >>> ");
//        double score = scanner.nextDouble();
//        System.out.print("이름을 입력하세요 >>> ");
//        String name = scanner.next();

        System.out.println(name + " 학생의 점수는 " + score + "입니다.");
    }
}
