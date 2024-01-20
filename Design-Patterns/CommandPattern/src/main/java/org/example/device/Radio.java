package org.example.device;

import lombok.Getter;

@Getter
public class Radio implements ElectronicDevice{
    private int volume;
    @Override
    public void on() {
        System.out.println("Radio is ON");
    }

    @Override
    public void off() {
        System.out.println("Radio is OFF");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Volume up: " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Volume down: " + volume);
    }
}
