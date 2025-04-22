package ch04_scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        /*
            다음과 같이 콘솔에 출력될 수 있도록 코드를 작성하시오.
            나이를 입력하세요 >>> 19
            저는 올해 19살 입니다.
            내년에는 20살이 됩니다.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하세요 >>> ");
        int myAge = scanner.nextInt();
        System.out.println("저는 올해 " + myAge + "살 입니다. \n"
                            + "내년에는 " + (myAge + 1) + "살이 됩니다.");

    }
}
