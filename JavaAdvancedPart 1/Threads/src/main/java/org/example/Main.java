package org.example;

public class Main {
    public static void main(String[] args) {

        int n = 10;// Number of Threads

        for(int i = 0; i < n; i++) {
            System.out.println(Thread.currentThread());

            Thread1 t1 = new Thread1();
            t1.start();

            Thread t2 = new Thread(new Thread2());
            t2.start();
        }

    }
}