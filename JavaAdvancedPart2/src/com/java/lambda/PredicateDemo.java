package com.java.lambda;

import java.util.function.IntPredicate;

public class PredicateDemo {
    public static void main(String[] args) {
        IntPredicate predicate1 = new IntPredicate() {
            @Override
            public boolean test(int value) {
               return value <= 20;
            }
        };
        System.out.println(predicate1.test(10));
        System.out.println("------------------------\n");

        IntPredicate predicate2 = value -> value <= 20;
        System.out.println(predicate2.negate().test(50));
    }
}
