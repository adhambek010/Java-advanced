package org.example.device;

import lombok.Getter;

@Getter
public class TurnTVOn implements Command{

    private ElectronicDevice device;

    public TurnTVOn(ElectronicDevice device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
@Getter
class TurnTVOff implements Command{
    private ElectronicDevice device;

    public TurnTVOff(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
       device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
}
