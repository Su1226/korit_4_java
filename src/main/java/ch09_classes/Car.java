package ch09_classes;

public class Car {

    /*
        색상(빨강, 노랑, etc), 속도(100.200, etc) 필드를 정의하고
        drive() / break() / displayCarInfo() 메소드를 정의하라.

        1. drive() 결과값
            : 빨강 자동차가 주행 중입니다.
            : 최고 속도는 100 입니다.
        2. brake() 결과값
            : 빨강 자동차가 멈췄습니다.
        3. displayCarInfo() 결과값
            : 이 차의 색깔은 빨강색이고,
            : 최고 속도는 100km/h입니다.

            : 아 처우ㅏ 색깔은 노랑색이고
            : 최고 속도는 200km/h입니다.
            // 100이하면 보통, 100초과면 빠름.

        다 작성한 뒤, car 1의 색상은 빨강, 속도는 100으로 생성
        car2의 색상은 노랑, 속도는 200으로 실행한 후
        각각 drive(), brake(), displayCarInfo() 실행하고
        콘솔창에 결과를 출력하시오.
     */

    String color;
    int speed;

    public void drive() {
        System.out.println(color + " 자동차가 주행중입니다. \n"
                            + "최고 속도는 " + speed + "Km/h 입니다.");
    }

    public String brake() {
        return color + " 자동차가 멈췄습니다.";
    }

    public void displayCarInfo() {
        System.out.println("이 차의 색상은 " + color + " 이고, \n"
                        + "최고 속도는 " + speed + "입니다. " + ((speed > 100 ? "빠릅니다." : "보통입니다.")));

    }
}
