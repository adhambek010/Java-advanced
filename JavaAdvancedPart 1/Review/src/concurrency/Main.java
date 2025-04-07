package concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		executorInvoke();
		executorService();
	}
	
	private static void executorInvoke() {
		Executor executor = new Caller();
		executor.execute(() -> {
			System.out.println("Executer example");
		});
	}
	
	private static void executorService() {
		ExecutorService service = Executors.newFixedThreadPool(10);
		service.submit(() -> {
			System.out.println("Executor service example");
		});
	}

}

class Caller implements Executor{

	@Override
	public void execute(Runnable command) {
		command.run();
		
	}
	
}