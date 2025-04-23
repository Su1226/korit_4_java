package ch06_condition;

/*
    switch 문

    switch (변수명) {
        case 조건1 :
            실행문1
            break;
        case 조건2 :
            실행문2
            break;
        case 조건3 :
            실행문3
            break;
        case 조건4 :
            실행문4;
            break;
        default :
            실행문5;
    }
 */

import java.util.Scanner;

public class Condition07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int selectNum;
        String selectMenu;

        System.out.println(" [ 메뉴 선택 ] ");
        System.out.println("1. 1번 메뉴");
        System.out.println("2. 2번 메뉴");
        System.out.println("3. 3번 메뉴");
        System.out.println("4. 4번 메뉴");
        System.out.println("5. 5번 메뉴");

        System.out.print("메뉴를 선택하세요 >>> ");
//        selectNum = scanner.nextInt();
        selectMenu = scanner.next();

//        switch (selectNum) {
//            case 1:
//                System.out.println("메뉴 1을 선택하셨습니다");
//                break;
//            case 2:
//                System.out.println("메뉴 2을 선택하셨습니다");
//                break;
//            case 3:
//                System.out.println("메뉴 3을 선택하셨습니다");
//                break;
//            case 4:
//                System.out.println("메뉴 4을 선택하셨습니다");
//                break;
//            case 5, 6: // 조건식을 나열할 수도 있다.
//                System.out.println("메뉴 5을 선택하셨습니다");
//                break;
//            default: // 아무 조건식에 해당하지 않을 때 실행되며, 위의 실행문 중 하나가 실행되더라도 무조건 실행되는 부분이다.
//                System.out.println("없는 메뉴입니다.");
//        }

        // swtich문도 조건문을 순서대로 위에서 아래로 찾긴 하지만,
        // break를 넣어주지 않는다면 찾은 조건부터 아래의 모든 코드를 실행하게 된다.
        // 때문에 break를 넣어줘야 하며,
        // break의 의미는 조건문을 탈출한다는 의미이다.

        switch (selectMenu) { // 조건식이 숫자가 아니라 String이나 char일때는 그에 맞게 case의 조건식을 넣어야 한다.
            case "1":
                System.out.println("메뉴 1을 선택하셨습니다");
                break;
            case "2":
                System.out.println("메뉴 2을 선택하셨습니다");
                break;
            case "3":
                System.out.println("메뉴 3을 선택하셨습니다");
                break;
            case "4":
                System.out.println("메뉴 4을 선택하셨습니다");
                break;
            case "5": // 조건식을 나열할 수도 있다.
                System.out.println("메뉴 5을 선택하셨습니다");
                break;
            default: // 아무 조건식에 해당하지 않을 때 실행되며, 위의 실행문 중 하나가 실행되더라도 무조건 실행되는 부분이다.
                System.out.println("없는 메뉴입니다.");
        }

    }
}
