package org.example.observables;

import org.example.observers.Observer;

public interface Observable {
    void add(Observer observer);

    void remove(Observer observer);

    void notifyObservers();
}
