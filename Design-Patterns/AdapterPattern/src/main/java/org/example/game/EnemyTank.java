package org.example.game;

import lombok.Getter;

import java.util.Random;

@Getter
public class EnemyTank implements EnemyAttacker{

    private Random generator = new Random();
    @Override
    public void fireWeapon() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.printf("Enemy Tank does %s Damage\n", attackDamage);
    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.printf("Enemy Tank moves %s spaces\n", movement);
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.printf("%s is driving the tank", driverName);
    }
}
