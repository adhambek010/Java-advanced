package com.java.thread;

public class ThreadsJoin {

	public static int counter1 = 0;
	public static int counter2 = 0;

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					counter1 += 1;
				}

			}
		});
		thread1.setName("Thread 1");
		thread1.start();

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					counter2 += 1;
				}

			}
		});
		thread2.setName("Thread 2");
		thread2.start();
		
		Thread thread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					thread1.join();
					thread2.join();
					System.out.println("Counter 1 : " + counter1);
					System.out.println("Counter 2 : " + counter2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});
		thread3.setName("Thread 3");
		thread3.start();
		
		System.out.println("Main Thread!! " + Thread.currentThread().getName());
		
	}

}
