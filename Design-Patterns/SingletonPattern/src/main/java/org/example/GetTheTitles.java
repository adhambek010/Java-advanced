package org.example;

import java.util.LinkedList;

public class GetTheTitles implements Runnable {
    @Override
    public void run() {
        Singleton newInstance = Singleton.getInstance();
        System.out.println("Instance ID: " + System.identityHashCode(newInstance));
        System.out.println(newInstance.getLettrsList());

        LinkedList<String> playerOneTiles = newInstance.getTiles(7);
        System.out.println("Player : " + playerOneTiles);
        System.out.println("Got Tiles");
    }
}
