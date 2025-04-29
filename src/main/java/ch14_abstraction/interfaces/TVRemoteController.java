package ch14_abstraction.interfaces;

public class TVRemoteController {
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TVRemoteController(PowerButton powerButton,
                              ChannelDownButton channelDownButton,
                              ChannelUpButton channelUpButton,
                              VolumeDownButton volumeDownButton,
                              VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    // 위 필드의 메소드 정의

    public void onPressedPowerButton() {
        System.out.print("TV의 ");
        powerButton.onPressed(); // 메소드 내에서 메소드 호출
    }

    public void onDownChannelButton() {
        System.out.print("TV의 ");
        channelDownButton.onDown();
    }

    public void onPressedDownChannelButton() {
        System.out.print("TV의 ");
        channelDownButton.onPressed();
    }

    public void onUpChannelButton() {
        System.out.print("TV의 ");
        System.out.println(channelUpButton.onUp());
    }

    public void onPressedUpChannelButton() {
        System.out.print("TV의 ");
        channelUpButton.onPressed();
    }

    public void onDownVolumeButton() {
        System.out.print("TV의 ");
        volumeDownButton.onDown();
    }

    public void onPressedVolumeDownButton() {
        System.out.print("TV의 ");
        volumeDownButton.onPressed();
    }

    public void onUpVolumeButton() {
        System.out.print("TV의 ");
        System.out.println(volumeUpButton.onUp());
    }

    public void onPressedVolumeUpButton() {
        System.out.print("TV의 ");
        volumeUpButton.onPressed();
    }

}
