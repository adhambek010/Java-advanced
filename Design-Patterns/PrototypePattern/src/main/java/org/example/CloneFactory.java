package org.example;

import org.example.animal.Animal;

public class CloneFactory {
    public Animal getClone(Animal animal){
        return animal.makeCopy();
    }
}
