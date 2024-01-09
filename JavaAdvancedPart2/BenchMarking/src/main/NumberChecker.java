package main;

public class NumberChecker {

    public Boolean isPrime1(Integer testNumber) {
        for (Integer i = 2; i < testNumber; i++) {
            if (testNumber % i == 0) return false;
        }
        return true;
    }
    public Boolean isPrime2(int testNumber) {
        for (int i = 2; i < Math.sqrt(testNumber); i++) {
            if (testNumber % i == 0) return false;
        }
        return true;
    }
    public boolean isPrime3(int testNumber) {
        for (int i = 2; i < Math.log(testNumber); i++) {
            if (testNumber % i == 0) return false;
        }
        return true;
    }



}
