package org.example.device;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {
    public static void main(String[] args) {
        ElectronicDevice device = TVRemote.getDevice();

        TurnTVOff offCommand = new TurnTVOff(device);
        DeviceButton offPressed = new DeviceButton(offCommand);
        offPressed.press();

        //---------------------------------------

        TurnTVOn onCommand = new TurnTVOn(device);
        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();

        //---------------------------------------

        VolumeUp upCommand = new VolumeUp(device);
        DeviceButton upPressed = new DeviceButton(upCommand);
        upPressed.press();
        upPressed.press();
        upPressed.press();

        //---------------------------------------

        VolumeDown downCommand = new VolumeDown(device);
        DeviceButton downPressed = new DeviceButton(downCommand);
        downPressed.press();

        //---------------------------------------

        ElectronicDevice theTV = new Television();
        ElectronicDevice theRadio = new Radio();
        List<ElectronicDevice> devices = new ArrayList<>();
        devices.add(theTV);
        devices.add(theRadio);

        TurnAllOff allOff = new TurnAllOff(devices);
        DeviceButton turnThemOff = new DeviceButton(allOff);
        turnThemOff.press();
        turnThemOff.undoPress();
    }
}
