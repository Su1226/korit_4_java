package ch07_loops;

/*
    for 반복문(for loop)
    : 대부분의 경우에 명확한 횟수가 고정되어 있을 때 사용하는 반복문

    형식
    for (시작값 ; 종료값 ; 증감값) {
        실행문;
    }
 */

public class Loop03 {
    public static void main(String[] args) {

        // 1부터 100까지 합을 구하는 for문
        int sum = 0;
        for(int i = 0; i < 101; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
