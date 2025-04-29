package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {

        TVRemoteController controller = new TVRemoteController(
                                                                new PowerButton(),
                                                                new ChannelDownButton(),
                                                                new ChannelUpButton(),
                                                                new VolumeDownButton(),
                                                                new VolumeUpButton()
        );

        // 별개의 PowerButton 객체를 생성핻 메소드 호출이 가능한가?
        PowerButton powerButton = new PowerButton();

        controller.onPressedPowerButton();      // 결과값 : 전원을 켭니다.
        powerButton.onPressed(); // 가능하다.    // 결과값 : 전원을 켭니다. // 즉, 별개로 돌아감.
        controller.onPressedPowerButton();     // 결과값 : 전원을 끕니다.
        // 즉 다른 객체로 동작을 한다.

        controller.onDownChannelButton();
        controller.onUpChannelButton();

        controller.onPressedDownChannelButton();
        controller.onPressedUpChannelButton();

        controller.onDownVolumeButton();
        controller.onPressedVolumeDownButton();

        controller.onUpVolumeButton();
        controller.onPressedVolumeUpButton();

    }
}
