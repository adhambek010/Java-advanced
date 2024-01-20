package org.example.pizza;

public class PizzaMaker{
    public static void main(String[] args) {
        Pizza pizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        System.out.println("Ingredients : " + pizza.getDescription());
        System.out.println("Cost : " + pizza.getCost());
    }
}

class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
