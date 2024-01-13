package org.example.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        executorInvoke();
        executorServiceInvoke();

    }

    private static void executorInvoke() {
        Executor executor = new Caller();

        executor.execute(() -> {
            System.out.println("Executor example");
        });
    }

    private static void executorServiceInvoke() {

        ExecutorService service = Executors.newFixedThreadPool(10);

        service.submit(() -> {
            System.out.println("ExecutorService example");
        });
    }

}
