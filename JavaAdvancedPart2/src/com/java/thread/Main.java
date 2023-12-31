package com.java.thread;

public class Main {

	public static int balance = 0;
	
	public synchronized void withdraw(int amt) {
		if(balance <= 0) {
			System.out.println("Waiting for amount to be updated after withdrawl of $"+amt);
			try {
				wait(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amt;
		System.out.println("The current balance is " + balance);
	}
	
	public void deposit(int amt) {
		synchronized (this) {
			System.out.println("We are depositing the amount in the bank of sum $"+amt);
			balance += amt;
			
			notify();
		}
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				main.withdraw(1000);
				
			}
		});
		thread1.setName("Thread 1");
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.err.println(e.toString());
					e.printStackTrace();
				}
				main.deposit(2000);
				
			}
		});
		thread2.setName("Thread 2");
		thread2.start();

	}

}
