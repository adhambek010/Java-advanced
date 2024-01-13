package org.example.observers;

import org.example.observables.WeatherStation;

public class Display implements Observer{

    WeatherStation station;
    public Display(WeatherStation station){
        this.station = station;
    }
    @Override
    public void update() {
        int temperature = this.station.getTemperature();
        System.out.println(temperature);
    }

    public WeatherStation getStation() {
        return station;
    }

    public void setStation(WeatherStation station) {
        this.station = station;
    }
}

