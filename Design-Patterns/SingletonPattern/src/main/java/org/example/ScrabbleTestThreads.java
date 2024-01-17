package org.example;

public class ScrabbleTestThreads {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable1 = new GetTheTitles();
        Runnable runnable2 = new GetTheTitles();

        new Thread(runnable1).start();
        new Thread(runnable2).start();

        Thread.sleep(2000);
    }
}
