package src.main.java.decoratorpattern;

public abstract class AddonDecorator extends Beverage{

    @Override
    public abstract void description();

    @Override
    public abstract int cost();
}
