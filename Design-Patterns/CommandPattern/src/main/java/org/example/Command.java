package org.example;


public class Command implements Commands{

    private Light light;

    public Command(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void unexecute() {
        light.turnOf();
    }
}
