package org.example.pizza;

public class Mozzarella extends ToppingDecorator{
    public Mozzarella(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("Adding Dough");
        System.out.println("Adding Moz");
    }
    @Override
    public String getDescription(){
        return getTempPizza().getDescription() + ", Mozzarella";
    }
    @Override
    public double getCost(){
        return getTempPizza().getCost() + 0.50;
    }
}

class TomatoSauce extends ToppingDecorator{

    public TomatoSauce(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("Adding Sauce");
    }

    @Override
    public String getDescription() {
        return getTempPizza().getDescription() + ", Tomato Sauce";
    }

    @Override
    public double getCost() {
        return getTempPizza().getCost() + 0.35;
    }
}