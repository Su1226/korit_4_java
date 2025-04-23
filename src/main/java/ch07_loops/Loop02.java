package ch07_loops;

public class Loop02 {
    public static void main(String[] args) {
        // 1일차 1교시입니다. ~ 1일차 3교시입니다. / 5일차 3교시입니다.

        int day = 1;
        while (day < 6) {
            int lesson = 1;
            while (lesson < 4) {
                System.out.println(day + "일차" + lesson + "교시 입니다.");
                lesson++;
            }
            day++;
        }

    }
}
