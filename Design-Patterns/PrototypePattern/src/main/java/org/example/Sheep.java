package org.example;

import org.example.animal.Animal;

public class Sheep implements Animal {

    public Sheep(){
        System.out.println("Sheep is Made");
    }
    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is being Made");
        Sheep sheepObject = null;
        try {
            sheepObject = (Sheep) super.clone();
        }catch (CloneNotSupportedException e){
            e.fillInStackTrace();
        }
        return sheepObject;
    }

    @Override
    public String toString(){
        return "Baaaaaaaaa";
    }
}
