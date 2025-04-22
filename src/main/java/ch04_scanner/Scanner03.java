package ch04_scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("올해는 몇 년도인가요?");
        int year = scanner.nextInt();
        scanner.nextLine();                         // enter 키를 대신 받아주는 역할. 문제 해결을 위한 방법 중 하나.
        System.out.println("당신의 이름은 무엇인가요?");
        String name = scanner.nextLine();

        System.out.println("년도 : " + year);
        System.out.println("이름 : " + name);

        /*
            next() vs nextLine()
            - nextLine()은 띄어쓰기를 허용하고, enter를 누르는 것을 기준으로 데이터를 대입한다.
            - 반면, 나머지 자료형과 next()는 띄어쓰기를 허용하지 않는다.

            위의 이유로 next자료형()을 먼저 쓰고,
            그 다음 nextLine()을 사용하는 경우 문제가 발생한다.

            next자료형() 다음에 enter를 누르는 경우,
            그 다음 줄에 있는 nextLine()이 enter키가 입력된 것을 보고
            아무런 값도 집어 넣지 않고 바로 넘겨 버리는 현상이 생긴다.

            해당 문제 상황을 해결하기 위한 방법 :
            nextLine()이 미리 enter 키를 받아들여서 name에 아무런 값도
            입력받지 않고(대입 받지 않고) 넘어가는 상황이라고 할 수 있다.

            -> enter키를 한 번 받아주는 것이 있으면 해결이 된다.

            상수에서 정리한 내용을 기준으로,
            선언된 변수의 자료형에 따라 scanner.next자료형()이 자동으로 생성된다.

         */

//        Double dobleNum = scanner.nextDouble();
//        String str = scanner.next();
//        String strLine = scanner.nextLine();

        System.out.println("당신의 대학교는 >> ");
        String univ = scanner.next();

        // String 데이터를 입력할 때는 .next()와 .nextLine() 두 가지 사용이 가능하다.
        // 차이점을 .md 파일에 정리할 것.
        // 해당 문제점에 대한 처리 방법을 정리하여 블로그에 올리는 것 정도는 좋음.

    }
}
