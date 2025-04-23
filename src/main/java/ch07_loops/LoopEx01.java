package ch07_loops;

public class LoopEx01 {
    public static void main(String[] args) {
        /*
            중첩 while을 이용하여 구구단을 만들어라.
         */

        int fristNum = 2;

        while(fristNum < 10) {
            int secondNum = 1;
            while(secondNum < 10) {
                System.out.println(fristNum + "*" + secondNum + "=" + (fristNum * secondNum));
                secondNum++;
            }
            System.out.println();
            fristNum++;
        }
    }
}
