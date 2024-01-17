package org.example.game;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class EnemyShip {
    private String name;
    private ESWeapon weapon;
    private ESEngine engine;

    abstract void makeShip();

    abstract void displayEnemyShip();

    abstract void followHeroShip();

    abstract void enemyShipShots();

    String infoShip = String.format("The %s has a top speed of %s and attack power of %s",name,engine,weapon);

    @Override
    public String toString(){
        return infoShip;
    }
}
