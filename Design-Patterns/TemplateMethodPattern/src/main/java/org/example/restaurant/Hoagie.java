package org.example.restaurant;

public abstract class Hoagie {
    final void makeSandwich(){
        cutBun();
        if (customerWantsMeat()){
            addMeat();
        }
        if (customerWantsCheese()){
            addCheese();
        }
        if (customerWantsVegetables()){
            addVegetables();
        }
        if (customerWantsCondiments()){
            addCondiments();
        }

        wrapTheHoagie();
    }
    public void cutBun(){
        System.out.println("The Hoagie is Cut");
    }
    public abstract boolean customerWantsMeat();
    public abstract boolean customerWantsCheese();
    public abstract boolean customerWantsVegetables();
    public abstract boolean customerWantsCondiments();
    public abstract void addMeat();
    public abstract void addCheese();
    public abstract void addVegetables();
    public abstract void addCondiments();
    public void wrapTheHoagie(){
        System.out.println("Wrap the Hoagie");
    }
}
