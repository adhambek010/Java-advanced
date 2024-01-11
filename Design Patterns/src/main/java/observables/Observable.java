package src.main.java.observables;

import src.main.java.observers.Observer;

public interface Observable {
    void add(Observer observer);

    void remove(Observer observer);

    void notifyObservers();
}
