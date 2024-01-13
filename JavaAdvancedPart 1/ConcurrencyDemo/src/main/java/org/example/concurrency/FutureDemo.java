package org.example.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureDemo {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> future = executorService.submit(() -> {
            Thread.sleep(5000);
            return "Completed";
        });

        try {
            while (!future.isDone()) {
                System.out.println("Task still in progress...wait");
                Thread.sleep(500);
            }

            System.out.println("Task is completed!");
            String result = future.get(3000, TimeUnit.MILLISECONDS);
            System.out.println(result);

            executorService.shutdown();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            future.cancel(true);
            future.isDone();
            future.isCancelled();
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
