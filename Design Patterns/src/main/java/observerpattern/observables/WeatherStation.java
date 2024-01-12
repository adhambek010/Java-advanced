package src.main.java.observerpattern.observables;

import src.main.java.observerpattern.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{

    private int temperature;
    private List<Observer> observerList = new ArrayList<>();
    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(Observer::update);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
