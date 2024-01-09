package main;
public class Main {
    public static void main(String[] args) {
        NumberChecker nc =  new NumberChecker();

        // result isPrime1 Time taken 351 ms
        // result isPrime2 Time taken 6 ms
        // result isPrime3 Time taken 5 ms

        // Warm up section
        for(int i = 0; i <= 20_000; i++){
            nc.isPrime3(i);
        }
        System.out.println("Warm up finished");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }

        long start = System.currentTimeMillis();
        for(int i = 1; i <= 50_000; i++){
            nc.isPrime3(i);
        }
        long end = System.currentTimeMillis();

        System.out.println("Time taken " + (end - start) + " ms");


    }
}
