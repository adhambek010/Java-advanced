package org.example.game;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class EnemyShip {
    private String name;
    private double amtDamage;

    public void followShip(){
        System.out.println(getName() + " is following the here");
    }
    public void displayEnemyShip(){
        System.out.println(getName() + "is on the screen");
    }
    public void enemyShipShots(){
        System.out.println(getName() + " attacks and does " + getAmtDamage());
    }
}
