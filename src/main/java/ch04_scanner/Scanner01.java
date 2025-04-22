package ch04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

//        String name; // 변수 선언
//        name = "이수원";

        Scanner scanner = new Scanner(System.in);
        String nameInput;

        System.out.print("이름을 입력하시오. : ");
        nameInput = scanner.nextLine();

        System.out.println("입력된 이름은 : " + nameInput + "입니다.");

        /*
            System.out.println(); -> 코드를 실행한 후, 개행(줄바꿈)이 이루어짐.
            System.out.print(); -> 개행이 이루어지지 않음.

            ln : line new
         */

    }
}
