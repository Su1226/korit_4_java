package ch06_condition;
/*
    if - else 문 : if 다음에 있는 조건식이 true일 때는 if문 내의 {}의 실행문이 실행되고,
                  false일 때는 else 내의 {}의 실행문이 실행된다.

     - 형식
        if (조건식) {
            실행문;
            실행문;
            ...
        } else {
            실행문;
            ...
        }
 */
public class Condition02 {
    public static void main(String[] args) {

        int num1 = 0;

        if(num1 > 0) {
            System.out.println("num1은 양수입니다.");
        } else {
            System.out.println("num1은 음수이거나 0입니다.");
        }

    }
}
