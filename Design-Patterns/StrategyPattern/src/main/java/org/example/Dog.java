package org.example;

public class Dog extends Animal{

    public Dog(){
        super();
        setSound("Bark");
        flyingType = new CannotFly();
    }
    public void digHole(){
        System.out.println("Dog a hole");
    }

}
