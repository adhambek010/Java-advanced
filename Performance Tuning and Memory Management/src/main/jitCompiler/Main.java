package main.jitCompiler;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date startTime = new Date();
        PrimeNumbers primeNumbers = new PrimeNumbers();
        Integer max = Integer.parseInt(args[0]);
        primeNumbers.generateNumbers(max);
        Date endTime = new Date();
        System.out.println("Elapsed time was : " + (endTime.getTime() - startTime.getTime()) + " ms.");
        // 228 ms
        // -client 223 ms
        // -server 285 ms
    }
}
