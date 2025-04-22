package ch03_operation;

/*
    1. 카멜 표기법(Camel Case) -> Java 변수 표기법
    2. 스네이크 표기법(snake Case) -> Java에서는 잘 쓸 일이 없음.
    3. 파스칼 표기법(Pascal Case) -> 첫 문자가 대문자고 나머지는 소문자로 가다가
                                   두 번재 단어의 첫 번째 문자는 또 대문자로 작성
                                   예) 한 단어 짜리 단어 : Operation01
                                   예) 복수 단어 : OperatorTest
 */

public class Operation01 {

    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int i = 10;

        /*
            대입 연산자(=) : 대입 연산자(=)를 기준으로 오른쪽에 있는 데이터를 대입 연산자 왼쪽에 있는 변수에
                           '대입한다'라는 의미로, 변수와 데이터가 동일하다는 수학적인 의미와는 다르다.
         */

        int i2 = 20;
        i2 = i2 +30; // i2 = 20 + 30;

        // 대입 연산자를 기준으로 오른쪽과 왼쪽이 같은 경우, == 를 사용한다.
//        System.out.println(i == i2); // false

        /*
            일반 연산자
            + : 더하기
            - : 빼기
            * : 곱하기
            / : 나누기 (몫)
            % : 나머지 연산자
         */

//        System.out.println(5 / 2); // 몫 : 2
//        System.out.println(5 % 2); // 나머지 : 1
//
//        int a = 5;
//        int b = 2;
//        double result = (double) a / b;
//
//        System.out.println(result);

        /*
            복합 대입 연산자
            +=
            -=
            *=
            /=
         */

//        int n1 = 1;
//
//        System.out.println(n1);
//        n1 += 2;                    // n1 = n1 + 2
//        System.out.println(n1);
//        n1 -= 1;                    // n1 = n1 - 1
//        System.out.println(n1);
//        n1 *= 10;                   // n1 = n1 * 10
//        System.out.println(n1);
//        n1 /= 5;                    // n1 = n1 / 5
//        System.out.println(n1);
//
//        int j = 10;
//
//        System.out.println(j);
//        System.out.println(j++);    // 변수명++ : 코드를 실행시킨 후, 다시 한 번 호출 될 때 1이 더해짐.
//        System.out.println(j);      // 다시 호출되었을 때, 1이 더해져 11이 된 것을 볼 수 있음.
//        System.out.println(++j);    // ++변수명 : 코드를 실행시키자마자 바로 변수에 1을 더하기 때문에, 결과값은 12이다.
//        System.out.println(j);      // 결과값은 12
//        System.out.println(j--);    // 변수명-- : 코드를 실행시킨 후, 다시 한 번 호출 될 때 1이 빼진다.
//        System.out.println(j);      // 다시 호출되었을 때, 1이 빼져 11이 된 것을 볼 수 있음.

        int age = 10;
        System.out.println("제 나이는 " + age + "입니다.");
        System.out.println("내년에는" + age + 1 +"살이 됩니다."); // 문자열로 시작했기 때문에, 문자열이 되었으므로 10과 1을 나열되었다.
        System.out.println("내년에는" + (age + 1) +"살이 됩니다."); // 수학 연산을 위해 괄호를 해줘야 한다.


    }
}
