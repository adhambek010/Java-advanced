package org.example.game;

public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String shipType){
        EnemyShip newShip = null;
        if (shipType.equalsIgnoreCase("U")){
            return new UFOEnemyShip();
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
