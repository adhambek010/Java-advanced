package org.example.game;

import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip enemy = null;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("What type of ship? (U / R / B)");
            if (scanner.hasNextLine()) {
                String typeOfShip = scanner.nextLine();
                enemy = shipFactory.makeEnemyShip(typeOfShip);
            }

            if (enemy != null){
                doStuffEnemy(enemy);
            }else {
                System.out.println("Wrong input please try again");
            }
        }while (enemy == null);

    }

    public static void doStuffEnemy(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followShip();
        enemyShip.enemyShipShots();
    }
}
