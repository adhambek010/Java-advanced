package org.example.game;

public class EnemyShipFactory2 {
    public EnemyShip2 makeEnemyShip(String shipType){
        EnemyShip2 newShip = null;
        if (shipType.equalsIgnoreCase("U")){
            return new UFOEnemyShip3();
        } else if (shipType.equalsIgnoreCase("R")) {
            return new RocketEnemyShip();
        }else if(shipType.equalsIgnoreCase("B")){
            return new BiUFOEnemyShip();
        }
        else {
            return null;
        }
    }
}
