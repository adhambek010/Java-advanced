package org.example.device;

import lombok.Getter;

@Getter
public class VolumeUp implements Command{
    private ElectronicDevice device;

    public VolumeUp(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void undo() {
        device.volumeDown();
    }
}

@Getter
class VolumeDown implements Command{
    private ElectronicDevice device;

    public VolumeDown(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }

    @Override
    public void undo() {
        device.volumeUp();
    }
}
