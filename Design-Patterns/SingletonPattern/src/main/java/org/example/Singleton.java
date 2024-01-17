package org.example;

import lombok.Getter;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

@Getter
public class Singleton {
    private static Singleton firstInstance = null;

    private String[] scrabbLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "b", "b", "b", "b", "b", "c", "c", "c", "c", "c", "d", "d", "d", "d", "d", "d",
            "e", "e", "e", "e", "e", "e", "f", "f", "f", "f", "f", "f", "g", "g", "g", "g", "g", "g",
            "h", "h", "h", "h", "h", "h", "i", "i", "i", "i", "i", "i", "j", "j", "j", "j", "j", "j",
            "k", "k", "k", "k", "k", "k", "l", "l", "l", "l", "l", "l", "m", "m", "m", "m", "m", "m",
            "n", "n", "n", "n", "n", "n", "o", "o", "o", "o", "o", "o", "p", "p", "p", "p", "p", "p",
            "q", "q", "q", "q", "q", "q", "r", "r", "r", "r", "r", "r", "s", "s", "s", "s", "s", "s",
            "t", "t", "t", "t", "t", "t", "u", "u", "u", "u", "u", "u", "v", "v", "v", "v", "v", "v",
            "w", "w", "w", "w", "w", "w", "x", "x", "x", "x", "x", "x", "y", "y", "y", "y", "y", "y",
            "z", "z", "z", "z", "z", "z"};
    private LinkedList<String> lettrsList = new LinkedList<>(Arrays.asList(scrabbLetters));
    private static boolean firstThread = true;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (firstInstance == null) {
            if (firstThread) {
                firstThread = false;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            firstInstance = new Singleton();
            Collections.shuffle(firstInstance.lettrsList);
        }
        return firstInstance;
    }

    public LinkedList<String> getTiles(int howManyTiles) {
        LinkedList<String> tilesToSend = new LinkedList<>();
        for (int i = 0; i < howManyTiles; i++) {
            tilesToSend.add(firstInstance.lettrsList.remove(0));
        }
        return tilesToSend;
    }

}