package ch23_lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        // List 생성 (선언과 초기화 동시)
        List<String> fruits = Arrays.asList("사과", "바나나", "딸기");

        // forEach 예제
        fruits.forEach(fruit -> System.out.println("과일 : " + fruit));

        System.out.println();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(number -> System.out.println("리스트 요소의 두배 값 : " + (number * 2)));
        System.out.println();
        numbers.forEach(number -> System.out.print(number * 2 + " "));
    }
}
