package org.example.restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant beefResto = new BeefBurgerRestaurant();
        Burger beefBurger = beefResto.orderBurger();

        Restaurant veggieResto = new VeggieBurgerRestaurant();
        Burger veggieBurger = veggieResto.orderBurger();

        Restaurant chickenResto = new ChickenBurgerRestaurant();
        Burger chickenBurger = chickenResto.orderBurger();

    }
}
