package main.exploringMemory;

public class Main {

    public static void calculate(int calcValue) {
        calcValue *= 100;
        return;
    }

    public static void main(String[] args) {
        int localValue = 5;
        calculate(localValue);
        System.out.println(localValue);
    }
}
