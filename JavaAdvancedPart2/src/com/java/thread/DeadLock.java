package com.java.thread;

public class DeadLock {
    private static String lock1 = "Lock 1";
    private static String lock2 = "Lock 2";

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        System.err.println(e.getMessage());
                    }
                    System.out.println("Thread 1, Lock 1");
                    synchronized (lock2){
                        System.out.println("Thread 1, Lock 2");
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        System.err.println(e.getMessage());
                    }
                    System.out.println("Thread 2, Lock 2");
                    synchronized (lock1){
                        System.out.println("Thread 2, Lock 1");
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
    }

}
