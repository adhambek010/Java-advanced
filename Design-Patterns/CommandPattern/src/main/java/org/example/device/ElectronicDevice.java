package org.example.device;

public interface ElectronicDevice {
    void on();
    void off();
    void volumeUp();
    void volumeDown();
}

interface Command{
    void execute();
    void undo();
}
