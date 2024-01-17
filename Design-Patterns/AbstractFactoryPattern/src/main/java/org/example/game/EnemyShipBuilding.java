package org.example.game;

public abstract class EnemyShipBuilding {

    protected abstract EnemyShip makeEnemyShip(String typeOfShip);
    public EnemyShip orderEnemyShip(String typeOfShip){
        EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);

        theEnemyShip.makeShip();
        theEnemyShip.displayEnemyShip();
        theEnemyShip.followHeroShip();
        theEnemyShip.enemyShipShots();
        return theEnemyShip;
    }

    public EnemyShip orderShip(String ufo) {
        return null;
    }
}
