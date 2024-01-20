package org.example.devices;

public class TestTheRemote {
    public static void main(String[] args) {
        RemoteButton theTV = new TVRemoteMute(new TVDevice(1,200));
        RemoteButton theTV2 = new TVRemotePause(new TVDevice(1,200));

        System.out.println("Test TV with Mute");
        theTV.buttonFivePressed();
        theTV.buttonSixPressed();
        theTV.buttonNinePressed();
        theTV.deviceFeedBack();

        
    }
}
