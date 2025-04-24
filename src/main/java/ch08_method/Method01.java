package ch08_method;

import java.util.Scanner;

public class Method01 {
    // 1. [ x | x ] [ 입력값 / 출력값 ]
    public static void call1() {
        System.out.println("[ x | x ]");
    }

    // 2. [ o | x ]
    public static void call2(String strExample) {
        System.out.println("[ o | x ]");
        System.out.println("오늘의 다짐 : " + strExample);
    }

    // 3. [ x | o ]
    public static String call3() {
        System.out.println("[ x | o ]");
        String result = "";                 // 지역 변수 - 메서드 내에 정의된 변수
        for( int i = 0 ; i < 3 ; i++ ) {
            for (int j = 0 ; j < i + 1 ; j++) {
                result += "🎁";
            }
            result += "\n"; // \n - 개행하라는 의미 \t -> 공백 두번 / 네번
        }
        return result;
    }

    // 4. [ o | o ]
    public static String call4(int year, int month, int date, String day) {
        System.out.println("[ o | o ]");
        return year + "년 " + month + "월 " + date + "일 " + day + "입니다. 😂 힘내요" ;
    }

    public static String introduce(String name, int age) {
        return "제 이름은 " + name + " 입니다. 나이는 " + age + "살 입니다. \n내년에는 " + (age+1) + " 살이 됩니다.";
    }

    public static void main(String[] args) {
        // method를 실행하는 영역
        call1();
        call2("메소드 call2() 호출");
        System.out.println(call3());

        System.out.println(call4(2025, 4, 24, "목요일"));
        System.out.println(introduce("이수원", 25));

        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("나이를 입력하세요 >>> ");
        int age = scanner.nextInt();

        String introdution = introduce(name, age);

        System.out.println(introdution);

/*
    함수형 프로그래밍(Funtional Programming)
    : 메소드1의 return 값이 메소드2의 argument가 되고,
    메소드2의 return 값이 메소드3의 argument가 되는 방식으로,

    첫 번째 메소드로부터 마지막 메소드까지의 흐름을 통해 프로그램이 이어지는 방식을 의미한다.

    위 예시에서는 .nextLine()의 결과값과 .nextInt()의 결과값이
    .introduce()의 argument1, argument2로 사용되었다.
 */

    }

}
