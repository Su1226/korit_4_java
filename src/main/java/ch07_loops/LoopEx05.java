package ch07_loops;

public class LoopEx05 {
    public static void main(String[] args) {
        // for문을 사용하여 구구단을 구현하라.

        for (int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
