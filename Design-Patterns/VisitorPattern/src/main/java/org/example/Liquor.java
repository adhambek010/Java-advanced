package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Liquor implements Visitable{
    private double price;
    public Liquor(double price) {
        this.price = price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
@Getter
@Setter
class Tobacco implements Visitable{
    private double price;

    public Tobacco(double price) {
        this.price = price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

@Getter
@Setter
class Necessity implements Visitable{
    private double price;

    public Necessity(double price) {
        this.price = price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}