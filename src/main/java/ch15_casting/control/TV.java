package ch15_casting.control;

public class TV implements Power{
    @Override
    public void on() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("TV를 끕니다.");
    }

    public void channelUP() {
        System.out.println("TV 채널을 한 칸 올립니다.");
    }
}
