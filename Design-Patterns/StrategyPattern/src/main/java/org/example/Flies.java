package org.example;

public interface Flies {
    String fly();
}

class ItFlies implements Flies{

    @Override
    public String  fly() {
        return "Flying high";
    }

}
class CannotFly implements Flies{
    @Override
    public String fly(){
        return "I cannot fly";
    }
}
