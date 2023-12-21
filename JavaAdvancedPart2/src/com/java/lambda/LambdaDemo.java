package com.java.lambda;

interface Info{
    int demo(int x, float f);
}
public class LambdaDemo {
    public static void main(String[] args) {

        Info info = (int x, float f) -> {
            System.out.println("Value of x = " + x);
            System.out.println("Value of f = " + f);
            return x;
        };
        System.out.println(info.demo(10,65.00F));
    }
}
