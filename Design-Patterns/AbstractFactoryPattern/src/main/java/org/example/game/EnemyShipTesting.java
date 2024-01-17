package org.example.game;

import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipBuilding makeUFOS = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = makeUFOS.orderShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = makeUFOS.orderShip("UFO BOOS");
        System.out.println(theBoss + "\n");
    }
}
