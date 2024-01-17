package org.example.game;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {
    @Override
    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;

        if (typeOfShip.equalsIgnoreCase("UFO")){
            EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Grunt Ship");
        }else if(typeOfShip.equalsIgnoreCase("UFO BOSS")){
            EnemyShipFactory shipPartsFactory = new UFOBoosEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Boos Ship");
        }
        return theEnemyShip;
    }
}
