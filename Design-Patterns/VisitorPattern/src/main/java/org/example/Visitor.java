package org.example;

public interface Visitor {
    double visit(Liquor liquorItem);
    double visit(Tobacco tobaccoItem);
    double visit(Necessity necessityItem);
}
interface Visitable{
    double accept(Visitor visitor);
}