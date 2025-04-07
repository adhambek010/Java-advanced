package threads;

class Thread1 extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("Thread 1 is running");
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
		
	}
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		try {
			System.out.println("Thread 2 is running");
		}catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}

}

public class ThreadDemo {

	public static void main(String[] args) {
		int n = 10;
		
		for(int i = 0; i < n; i++) {
			Thread1 thread1 = new Thread1();
			thread1.start();
			
			Thread thread = new Thread(new Thread2());
			thread.start();
		}
	}

}
