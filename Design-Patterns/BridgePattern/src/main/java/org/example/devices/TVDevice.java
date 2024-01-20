package org.example.devices;

public class TVDevice extends EntertainmentDevice{
    public TVDevice(int deviceState, int maxSetting) {
        super();
        super.deviceState = deviceState;
        super.maxSetting = maxSetting;
    }

    @Override
    protected void buttonFivePressed() {
        System.out.println("Channel Down");
        --deviceState;
    }

    @Override
    protected void buttonSixPressed() {
        System.out.println("Channel Up");
        ++deviceState;
    }
}
