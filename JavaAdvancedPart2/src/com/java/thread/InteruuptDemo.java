package com.java.thread;

public class InteruuptDemo {

	public static int balance = 0;

	public synchronized void withdraw(int amt) {
		if (balance <= 0) {
			System.out.println("Waiting for amount to be updated after withdrawl of $" + amt);
			try {
				wait(3000);
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
				return;
			}
		}
		
		if(balance - amt < 0) {
			System.err.println("Balance is too low for withdrawal");
			return;
		}
		balance -= amt;
		System.out.println("The current balance is " + balance);
	}

	public boolean deposit(int amt) {
		synchronized (this) {
			if (amt > 0) {
				System.out.println("We are depositing the amount in the bank of sum $" + amt);
				balance += amt;
				notify();
				return true;
			} else {
				System.out.println("Inavlid amount ");
				return false;
			}
		}
	}

	public static void main(String[] args) {

		InteruuptDemo demo = new InteruuptDemo();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				demo.withdraw(200);

			}
		});
		thread1.setName("Thread 1");
		thread1.start();

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.err.println(e.toString());
					e.printStackTrace();
				}
				if(demo.deposit(500)) {
					System.out.println("Transaction was succesful!");
				}else {
					thread1.interrupt();
					System.out.println("Invalid input please try again");
				}

			}
		});
		thread2.setName("Thread 2");
		thread2.start();

	}

}
