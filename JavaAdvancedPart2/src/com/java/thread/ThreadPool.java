package com.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadPoolDemo extends Thread{
	
	private String name;
	
	public ThreadPoolDemo(String name) {
		super(name);
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("Started thread : " + name);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ended thread   : " + name);
	}
}

public class ThreadPool {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		ThreadPoolDemo thread1 = new ThreadPoolDemo("Thread 1");
		ThreadPoolDemo thread2 = new ThreadPoolDemo("Thread 2");
		ThreadPoolDemo thread3 = new ThreadPoolDemo("Thread 3");
		ThreadPoolDemo thread4 = new ThreadPoolDemo("Thread 4");
		ThreadPoolDemo thread5 = new ThreadPoolDemo("Thread 5");
		ThreadPoolDemo thread6 = new ThreadPoolDemo("Thread 6");
		ThreadPoolDemo thread7 = new ThreadPoolDemo("Thread 7");
		ThreadPoolDemo thread8 = new ThreadPoolDemo("Thread 8");
		ThreadPoolDemo thread9 = new ThreadPoolDemo("Thread 9");
		ThreadPoolDemo thread10 = new ThreadPoolDemo("Thread 10");
		ThreadPoolDemo thread11 = new ThreadPoolDemo("Thread 11");
		ThreadPoolDemo thread12 = new ThreadPoolDemo("Thread 12");
		
		service.execute(thread1);
		service.execute(thread2);
		service.execute(thread3);
		service.execute(thread4);
		service.execute(thread5);
		service.execute(thread6);
		service.execute(thread7);
		service.execute(thread8);
		service.execute(thread9);
		service.execute(thread10);
		service.execute(thread11);
		service.execute(thread12);
		
		service.shutdown();
	}

}
