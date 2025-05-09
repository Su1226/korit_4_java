package ch23_lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExample {
    public static void main(String[] args) {
        // 기존의 익명 클래스 방식
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, Java!");
            }
        };

        // 위 방식으로 익명 클래스를 정의한 후,
        // 메소드를 호출한다.
        runnable.run();

        // Lambda 방식
        Runnable runnableLambda = () -> System.out.println("Hello, Java!");
        // 위 코드가 익명 클래스에서 메소드를 오버라이딩해서 재정의하는 부분까지 한 것.
        // 메소드 호출 가능
        runnableLambda.run();

        // 1. Supplier -> call2() 유형의 함수형 인터페이스
        Supplier<String> supplierStr = () -> "Hello, Functional Interface and Lambda!";
        System.out.println(supplierStr);

        // 2. Consumer -> call3() 유형의 함수형 인터페이스
        Consumer<String> consumerStr = (message) -> System.out.println("메시지 : " + message);

        // Supplier로부터 값을 생성한 후, Consumer를 통해서 내용을 출력한다.
        String message = supplierStr.get(); // message 변수에 "Hello, Functional Interface and Lambda!" 데이터가 대입됨.
        consumerStr.accept(message);

    }
}
