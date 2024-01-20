package org.example.restaurant;

public class ItalianHoagie extends Hoagie{

    String[] meatUsed = {"Salami", "Peperoni", "Ham"};
    String[] cheeseUsed = {"Provolone"};
    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peepers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};

    @Override
    public boolean customerWantsMeat() {
        return true;
    }

    @Override
    public boolean customerWantsCheese() {
        return true;
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
        System.out.println("Adding the Meat : ");
        for (String meat : meatUsed){
            System.out.println(meat + " ");
        }
    }

    @Override
    public void addCheese() {
        System.out.println("Adding the Meat : ");
        for (String cheese : cheeseUsed){
            System.out.println(cheese + " ");
        }
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
