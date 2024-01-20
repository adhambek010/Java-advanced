package org.example.device;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class TurnAllOff implements Command{
    private List<ElectronicDevice> devices;

    public TurnAllOff(List<ElectronicDevice> devices) {
        this.devices = devices;
    }

    @Override
    public void execute() {
        devices.forEach(ElectronicDevice::off);
    }

    @Override
    public void undo() {
        devices.forEach(ElectronicDevice::on);
    }
}
