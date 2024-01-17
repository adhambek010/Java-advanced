package org.example.game;

public class UFOEnemyShip extends EnemyShip {
    private EnemyShipFactory shipFactory;
    public UFOEnemyShip(EnemyShipFactory shipFactory){
        this.shipFactory = shipFactory;
    }

    @Override
    void makeShip() {
        System.out.println("Making enemy ship "+getName()) ;

        setWeapon(shipFactory.addESGun());
        setEngine(shipFactory.addESEngine());
    }

    @Override
    void displayEnemyShip() {
        System.out.println("Enemy ship is displayed.");
    }

    @Override
    void followHeroShip() {
        System.out.println("Ship is following the hero ship.");
    }

    @Override
    void enemyShipShots() {
        System.out.println("Enemy ship is shooting.");
    }
}
