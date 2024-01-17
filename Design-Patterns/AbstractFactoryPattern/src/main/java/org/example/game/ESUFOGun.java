package org.example.game;

public class ESUFOGun implements ESWeapon{
    @Override
    public String toString(){
        return "20 damage";
    }
}
class ESUFOEngine implements ESEngine{
    @Override
    public String toString(){
        return "1000 mph";
    }
}
