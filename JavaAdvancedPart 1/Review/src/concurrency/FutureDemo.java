package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FutureDemo {

	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		Future<String> future = service.submit(() -> {
			Thread.sleep(10000);
			return "Completed";
		});
		
		try {
			while (!future.isDone()) {
				System.out.println("Task still in progress ... wait");
				Thread.sleep(500);
			}
			
			System.out.println("Task completed");
			String result = future.get(3000, TimeUnit.MILLISECONDS);
			System.out.println(result);
			service.shutdown();
		} catch (Exception ex) {
			future.cancel(true);
			System.err.println("Error: " + ex.getMessage());
		}
	}

}
