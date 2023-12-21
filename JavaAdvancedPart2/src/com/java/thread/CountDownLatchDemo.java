package com.java.thread;

import java.util.concurrent.CountDownLatch;

class DemoThread extends Thread{
	
	private CountDownLatch latch;
	
	public DemoThread(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		
		System.out.println("Started Thread : " + Thread.currentThread().getName());
		System.out.println("Ended Thread   : " + Thread.currentThread().getName());
		System.out.println("******************************");
		latch.countDown();
	}
}

public class CountDownLatchDemo {

	public static void main(String[] args) {
		
		CountDownLatch latch = new CountDownLatch(4);
		
		DemoThread thread1 = new DemoThread(latch);
		DemoThread thread2 = new DemoThread(latch);
		DemoThread thread3 = new DemoThread(latch);
		DemoThread thread4 = new DemoThread(latch);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main thread : " + Thread.currentThread().getName());

	}

}
