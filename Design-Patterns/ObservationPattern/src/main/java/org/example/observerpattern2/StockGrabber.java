package org.example.observerpattern2;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class StockGrabber implements Subject{

    private List<Observer> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockGrabber(){
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        int index = observers.indexOf(observer);
        System.out.println("Observer " + (index + 1) + " deleted");
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        observers.forEach( e -> e.update(ibmPrice, applePrice, googlePrice));
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObservers();
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notifyObservers();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObservers();
    }
}
