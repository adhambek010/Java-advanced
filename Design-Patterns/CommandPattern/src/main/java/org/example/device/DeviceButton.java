package org.example.device;

import lombok.Getter;

@Getter
public class DeviceButton {
    private Command command;

    public DeviceButton(Command command) {
        this.command = command;
    }

    protected void press(){
        this.command.execute();
    }
    protected void undoPress(){
        this.command.undo();
    }
}

class TVRemote{
    public static  ElectronicDevice getDevice(){
        return new Television();
    }
}