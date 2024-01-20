package org.example.devices;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class RemoteButton {
    private EntertainmentDevice device;

    public RemoteButton(EntertainmentDevice device) {
        this.device = device;
    }
    protected void buttonFivePressed() {
        device.buttonFivePressed();
    }
    protected void buttonSixPressed() {
        device.buttonSixPressed();
    }
    protected void deviceFeedBack(){
        device.deviceFeedBack();
    }
    protected abstract void buttonNinePressed();
}
class TVRemoteMute extends RemoteButton{

    public TVRemoteMute(EntertainmentDevice device) {
        super(device);
    }

    @Override
    protected void buttonNinePressed() {
        System.out.println("TV was muted");
    }
}
class TVRemotePause extends RemoteButton{

    public TVRemotePause(EntertainmentDevice device) {
        super(device);
    }

    @Override
    protected void buttonNinePressed() {
        System.out.println("TV was paused");
    }
}