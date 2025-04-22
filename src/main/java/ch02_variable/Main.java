package ch02_variable;

/*
    주석(commet) : Java 프로그램의 경우 폴더 및 파일의 전체 코드를 컴파일링하는데,
                  해당 코드에서 오류가 하나라도 발생하면 전체 프로그램이 실행되지 않는다.
                  하지만, 주석 처리를 한 부분에 대해서는 컴퓨터가 코드로 인지하지 않기 때문에
                  오류가 발생하지 않는다.

                  즉, 주석이란 컴퓨터가 읽어서 처리하는 부분이 아니라 사람이 읽어서 정보를 얻을 수 있는데 의의가 있다.
                  1) 한 줄 주석 : //
                  2) 여러 줄 주석 : / + shift8 + enter
                  3) 사후 주석 : 주석 처리할 부분의 코드 라인에 ctrl + /
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("안녕하세요, 제 이름은 이수원 입니다."); // 한글 출력 가능
//        System.out.println(안녕하세요, 제 이름은 이수원 입니다.); -> 오류 발생
        // ctrl + d로 해당 문장 그대로 복사 + 붙이기가 된다.
        System.out.println(1);          // 1
        System.out.println("1");        // 1
        System.out.println(1 + 2);      // 3
        System.out.println("1 + 2");    // 1 + 2 -> 큰따움표 내에 있는 것을 그대로 출력해준다.
        System.out.println("1" + "2");  // 12
        System.out.println("1" + 2);    // 12
        // 데이터의 타입이 있다는 것을 알 수 있다.
        // 위와 같은 방식의 코드 대입을 'Hard Codeing'이라는 표현을 쓴다.
        // 명령문에 데이터(변수에 대입되지 않는 데이터를 리터럴(literal))를 바로 집어 넣는 것을 의미한다.
        // 해당 방법은 권장하지 않는 방법이다.
        // 데이터를 변수에 대입하고, 변수를 통해서 명령을 내리는 것이 권장되는 방법이다.

        /*
            변수(Variable) : 데이터를 담는 그릇. 변수에는 이름을 달아줘야 한다.
            변수 선언 방법 : 자료형 변수명 = 데이터;
            변수의 의미에 주목해보면 데이터의 값이 바뀔 수 있음을 의미힌다.
         */

        int scoreEnglish = 100; // 선언과 초기화 동시에
        System.out.println(scoreEnglish);

        scoreEnglish = 90; // 초기화
        System.out.println(scoreEnglish); // 변수는 데이터의 값이 바뀔 수 있다.

        String introduction = "안녕하세요, 저는 국비 교육을 받는 이수원입니다.";
        System.out.println(introduction);
        System.out.println(introduction + "앞으로 잘 부탁드리겠습니다."); // 변수와 함께 리터럴을 넣는 것도 가능하다.

        // 1. 논리 자료형(boolean) 변수 :  참(true) / 거짓(false)
        // 자료형 변수명 = 데이터;       -> 변수의 선언 및 초기화 
        
        boolean checkFalg1 = false;     // 변수의 선언 및 초기화 
        
        // 변수에 데이터 재대입
        checkFalg1 = true;
        
        boolean checkFlag2;            // 변수의 선언
        checkFlag2 = true;             // 변수의 초기화
        checkFlag2 = false;            // 변수의 재대입

        // 2. 문자 자료형 변수 char
        char name1 = '이';
        char name2 = '수';
        char name3 = '원';
        // 한 문자만 들어가는 것이 char -> char가 여러개가 모인 것이 String
        // char -> 문자 / String -> 문자열
        // 문자열은 순서가 중요하다. 즉, 조합된 상태가 중요하다.
        // Java는 대소문자 구분. (C언어도 동일.)

        System.out.println(name1 + name2 + name3); // 151644
        System.out.println("" + name1 + name2 + name3); // 이수원 
        /*
            위 2번 코드를 통해 알 수 있는 점은 컴퓨터는 멍청해서 개발자인 내가 
            하나하나 지정을 해줘야 한다는 점이다. 문자와 문자열은 서로 다른 개념인데,
            문자(하나짜리)를 세 번 더했을 경우에 더 이상 문자가 아니라 문자열로 인식되기 때문에
            원하는 방식으로 출력되지 않는다. (70Line)
            
            그렇기 때문에 우리는 71번 Line에서 sout()안에 ""을 넣어줌으로써, 
            () 내부가 전체적으로 문자열로 인식되도록 꼼수를 부린 것이다. 
            
            또 알 수 있는 점은, sout()에서 가장 먼저 나온 데이터의 자료형을 따라간다는 점이다.
         */

        System.out.println("123" + 1); // 1231
        System.out.println(123 + "1"); // 1231 -> 예외

        // 3. 정수 자료형 int
        int width1 = 100;
        int width2 = 200;
        System.out.println(width1 + width2); // 300 => 숫자끼리의 연산 가능.
        System.out.println(width2 + width1); // 300 => 숫자끼리의 연산에서는 순서가 결과에 상관없다.

        String width3 = "300";
        String width4 = "400";
        System.out.println(width3 + width4); // 300400 => 문자열끼리는 연산이 아니라 나열을 한다.
        System.out.println(width4 + width3); // 400300 => 문자열끼리는 연산에서는 순서에 따라 결과가 달라진다.

        // 4. 실수 자료형 변수 double
        double pi = 3.14159226;
        // int pi2 = 3.14;
        // 정수인지 실수인지를 구분한다.
        // 즉, int는 정수이므로 소숫점을 넣을 수 없다.

        // 연산 : + - * /
        // pi 변수를 이용하여 원의 반지름이 43인
        // 원의 둘레 및 넓이를 구하시오.
        // 원의 둘레 공식 : 지름 * pi
        // 원의 넓이 공식 : 반지름 제곱 * pi

        int r_len = 43;

        System.out.println((r_len) * 2 * pi);       // 270.17693436
        System.out.println((r_len) * (r_len) * pi); // 5808.80408874

        /*
            Java에서의 변수 표기 방식 :
                1. 카멜 표기법(Camel Case)
                    : 첫 문자는 소문자로 시작하고, 복수의 단어로 이루어졌을 경우
                    두 번째 단어의 첫 번째 문자만 대문자로 작성하는 방법.
                    예) 한 단어 짜리 : result
                    예) 복수 단어 : myTestResult
                2. 특수 문자 지양
                3. 첫 문자로 숫자가 불가능

                cf) Python에서는 변수 표기 방식은 snake case라고 하여, my_test_result와 같은 방식으로 선언한다.
         */

        // 문자열 자료형 변수 String
        String name = "이수원";
        String major = "컴퓨터공학과";
        String currentJob = "취업준비생";
        String previousJob = "개발자";

        System.out.println(name);
        System.out.println(major);
        System.out.println(currentJob);
        System.out.println(previousJob);
        // 위와 같이 변수에 대입하고 그 변수를 그대로 출력하는 방법이 가능하다.

        // 그러나, 다음과 같이 변수와 리터럴과 연결을 지어서 함께 사용이 가능하다.
        System.out.println("안녕하세요, 제 이름은 " + name + "입니다. 제 전공은 " + major
                        + "이고, 그래서 이전 직업은 " + previousJob + "이었습니다. 현재는 "
                        + currentJob + "입니다.");

        System.out.println();

        // 연습
        String myName;
        String myMajor;
        String myMBTI;
        int myAge;

        myName = "이수원";
        myMajor = "컴퓨터공학과";
        myMBTI = "INTJ";
        myAge = 25;

        System.out.println("저는 코리아 it 아카데미 4월 국비 과정을 수강하고 있는 " + myName + "입니다."
                            + myAge + "살 입니다. \n제 전공은 " + myMajor + "이며, MBTI는 "
                            + myMBTI +" 입니다. 열심히 할게요!!");

    }
}
