package org.example.devices;

import lombok.Getter;

@Getter
public abstract class EntertainmentDevice {
    protected int deviceState;
    protected int maxSetting;
    protected int volumeLevel;

    protected abstract void buttonFivePressed();
    protected abstract void buttonSixPressed();

    protected void deviceFeedBack(){
        if (deviceState > maxSetting || deviceState < 0){
            deviceState = 0;
            System.out.println("On "+deviceState);
        }
    }
    protected void buttonSevenPressed(){
        volumeLevel++;
        System.out.println("Volume at : "+volumeLevel);
    }
    protected void buttonEightPressed(){
        volumeLevel--;
        System.out.println("Volume at : "+volumeLevel);
    }

}
