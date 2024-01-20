package org.example.device;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Television implements ElectronicDevice{
    private int volume;

    @Override
    public void on() {
        System.out.println("TV is ON");
    }

    @Override
    public void off() {
        System.out.println("TV is OFF");
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
