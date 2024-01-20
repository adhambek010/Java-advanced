package org.example.restaurant;

public class VeggieHoagie extends Hoagie{

    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peepers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};

    @Override
    public boolean customerWantsMeat() {
        return false;
    }

    @Override
    public boolean customerWantsCheese() {
        return false;
    }

    @Override
    public boolean customerWantsVegetables() {
        return true;
    }

    @Override
    public boolean customerWantsCondiments() {
        return true;
    }

    @Override
    public void addMeat() {

    }

    @Override
    public void addCheese() {

    }

    @Override
    public void addVegetables() {
        System.out.println("Adding the Meat : ");
        for (String veggies : veggiesUsed){
            System.out.println(veggies + " ");
        }
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding the Meat : ");
        for (String condiments : condimentsUsed){
            System.out.println(condiments + " ");
        }
    }
}
