package org.example.pizza;

import lombok.Getter;

public interface Pizza {
    String getDescription();
    double getCost();
}
@Getter
abstract class ToppingDecorator implements Pizza{
    private Pizza tempPizza;

    public ToppingDecorator(Pizza tempPizza){
        this.tempPizza = tempPizza;
    }

    public String getDescription(){
        return tempPizza.getDescription();
    }
    public double getCost(){
        return tempPizza.getCost();
    }
}
