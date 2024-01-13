package org.example;

public class Thread2 extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Tread 2 is running");
        } catch (Exception e) {
            System.err.println(e.toString());
            e.printStackTrace();
        }

    }
}
