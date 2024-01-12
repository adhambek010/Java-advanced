package src.main.java.decoratorpattern;


public class Caramel extends AddonDecorator{

    private Beverage beverage;
    private int price;

    public Caramel(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public void description() {

    }

    @Override
    public int cost() {
        return this.beverage.cost()+this.price;
    }

}
