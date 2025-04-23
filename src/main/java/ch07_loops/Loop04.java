package ch07_loops;

public class Loop04 {
    public static void main(String[] args) {
        // 1일차 1교시입니다. ~ 5일차 3교시입니다.
        for (int i = 1; i < 6 ; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.println(i + "일차 " + j + "교시 입니다.");
            }
        }

        // for문 내에서 선언된 변수는 for문의 중괄호{} 내에서만 사용이 가능하다.
        // 외부의 같은 변수명이 있을 수 있음.

    }
}
