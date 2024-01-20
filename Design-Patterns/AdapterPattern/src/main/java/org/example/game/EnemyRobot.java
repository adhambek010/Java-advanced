package org.example.game;

import lombok.Getter;

import java.util.Random;

@Getter
public class EnemyRobot {
    private Random random = new Random();

    protected void smashWithHands(){
        int attackDamage = random.nextInt(10) + 1;
        System.out.printf("Enemy Robot Causes %s damage wih its hands\n", attackDamage);
    }
    protected void walkForward(){
        int movement = random.nextInt(5) + 1;
        System.out.printf("Enemy Robot walks forward %s spaces\n", movement);
    }
    protected void reactToHuman(String driverName){
        System.out.printf("Enemy Robot tramps on\n"+driverName);
    }
}
