package ch08_method;

/*
    출석부를 만드는 코드를 작성하라.

    메소드명 : registerStudent()
    return type : void

    실행 예)
    학번을 입력하세요 >>> 2024365
    이름을 입력하세요 >>> 이수원
    학번 : 2024365
    이름 : 이수원

    이 출력되는 메소드를 정의한다.
    또한 main 단계에서는 학생 수를 입력 받는다.

    실행 예)
    몇 명의 학생을 등록하시겠습니까? >>> 3
    학번을 입력하세요 >>> 2024287
    이름을 입력하세요 >>> 김일
    학번 : 2024284
    이름 : 김일
    학번을 입력하세요 >>>
    이름을 입력하세요 >>>
    학번 :
    이름 :
    학번을 입력하세요 >>>
    이름을 입력하세요 >>>
    학번 :
    이름 :

 */

import java.util.Scanner;

public class MethodEx01 {

    public static void registerStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학번을 입력하세요. >>> ");
        int studentNum = scanner.nextInt();
        System.out.print("이름을 입력하세요. >>> ");
        String studentName = scanner.next();

        System.out.println("학번 : " + studentNum);
        System.out.println("이름 : " + studentName);
    }

    public static void registerStudent2(int student) {
        for(int i=0; i<student; i++) {
            registerStudent(); // 재사용성의 예시
        }
    }

    public static void registerStudent3(int student) { // 1번과 2번을 합친 경우.
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < student; i++) {
            System.out.print("학번을 입력하세요. >>> ");
            int studentNum = scanner.nextInt();
            System.out.print("이름을 입력하세요. >>> ");
            String studentName = scanner.next();

            System.out.println("학번 : " + studentNum);
            System.out.println("이름 : " + studentName);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        int studentAll = scanner.nextInt();

        registerStudent2(studentAll);
        // registerStudent3(studentAll);
    }
}
