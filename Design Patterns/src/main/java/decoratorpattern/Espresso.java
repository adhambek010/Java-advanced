package src.main.java.decoratorpattern;

public class Espresso extends Beverage{

    private int price;
    @Override
    public void description() {

    }

    @Override
    public int cost() {
        return this.price;
    }
}
