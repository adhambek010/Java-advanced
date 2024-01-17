package org.example.observerpattern1.observables;

import org.example.observerpattern1.observables.observers.Observer;

public interface Observable {
    void add(Observer observer);

    void remove(Observer observer);

    void notifyObservers();
}
