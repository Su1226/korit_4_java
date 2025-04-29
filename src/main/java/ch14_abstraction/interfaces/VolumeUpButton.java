package ch14_abstraction.interfaces;

public class VolumeUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("음향을 한 칸 올립니다.");
    }

    @Override
    public String onUp() {
        return "음향을 계속 " + super.onUp();
    }
}
