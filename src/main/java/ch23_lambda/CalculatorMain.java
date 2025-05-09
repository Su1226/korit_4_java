package ch23_lambda;

public class CalculatorMain {
    // 정적 메소드 정의
    public static int operate(int a, int b, Calculator c) {
        return c.calculate(a, b);
    }

    public static void main(String[] args) {
        // 사용자 정의 interface인 Calculator를 활용할 예정 + 람다식도 사용
        Calculator add = (x, y) -> x + y;
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;       // y가 0이라면 예외 발생. -> div는 예외 처리가 되어있지 않음.

        // 정적 메소드 호출
        System.out.println("2 + 3 = " + operate(2, 3, add));
        System.out.println("2 - 3 = " + operate(2, 3, sub));
        System.out.println("2 * 3 = " + operate(2, 3, mul));
        System.out.println("2 / 3 = " + operate(2, 3, div));

        System.out.println();

        // y가 0이 되면 오류가 발생하기 때문에, 오류를 막기 위해 조건문을 활용.
        Calculator div2 = (x, y) ->  {
            if(y == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;       // 해당 부분이 없으면 return 타입이 없기 때문에 오류 발생.
            }
            return x / y;
        }; // div2는 예외 처리가 되어 있음.

        System.out.println("4 / 0 = " + operate(4, 0, div2));       // 예외처리를 해놨기 때문에 정상 처리.
        System.out.println("4 / 0 = " + operate(4, 0, div));        // 예외발생 (ArithmeticException) -> 오류.
    }
}
