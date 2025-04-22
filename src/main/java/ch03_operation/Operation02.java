package ch03_operation;

/*
    논리 연산자

    true(1) / false(0) : 컴퓨터가 읽을 수 있는 숫자
    boolean

    AND(&&) : 곱 연산자 -> 하나라도 False라면, 결과는 False
        T X T = T
        T X F = F
        F X T = F
        F X F = F
    OR(||) : 합 연산자 -> 하나라도 true라면, 결과는 true
        T X T = T
        T X F = T
        F X T = T
        F X F = F
    NOT(!) : true -> false로, false -> true로 역전시키는 연산자
 */

public class Operation02 {
    public static void main(String[] args) {

        boolean flag1 = true;
        boolean flag2 = false;

        System.out.println("----- && 연산자 ------");
        boolean result1 = flag1 && flag1;
        System.out.println("T x T = " + result1);
        boolean result2 = flag1 && flag2;
        System.out.println("T x F = " + result2);
        boolean result3 = flag2 && flag1;
        System.out.println("F x T = " + result3);
        boolean result4 = flag2 && flag2;
        System.out.println("F x T = " + result4);

        System.out.println();

        System.out.println("----- OR 연산자 ------");
        boolean result5 = flag1 || flag1;
        System.out.println("T x T = " + result5);
        boolean result6 = flag1 || flag2;
        System.out.println("T x F = " + result6);
        boolean result7 = flag2 || flag1;
        System.out.println("F x T = " + result7);
        boolean result8 = flag2 || flag2;
        System.out.println("F x T = " + result8);

        System.out.println();

        System.out.println("----- OR 연산자 ------");
        System.out.println(!flag1);
        System.out.println(!flag2);


        System.out.println();
        boolean result9 = (flag1 || flag2) && flag2;
        System.out.println(result9);                    // false

        boolean result10 = flag1 && flag2 && flag2;
        System.out.println(result10);                   // false

        System.out.println();
        boolean result11 = 10 % 3 == 0;
        System.out.println("10 / 3 연산의 나머지는 0이다? : " + result11);
    }
}
