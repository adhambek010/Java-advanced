package src.main.java.observerpattern.observables;

import src.main.java.observerpattern.observers.Observer;

public interface Observable {
    void add(Observer observer);

    void remove(Observer observer);

    void notifyObservers();
}
