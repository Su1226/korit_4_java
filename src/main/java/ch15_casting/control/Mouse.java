package ch15_casting.control;

public class Mouse implements Power {
    @Override
    public void on() {
        System.out.println("Mouse의 전원이 켜집니다.");
    }

    @Override
    public void off() {
        System.out.println("Mouse의 전원이 꺼집니다.");
    }
}
