package com.java.lambda;

import java.util.Arrays;
import java.util.List;

class Demo{
    private String name;

    public Demo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class ForEach {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(12,45,6,74,65,4,21,0);
        list1.forEach(e  -> System.out.println("Value : "+e));
        System.out.println("----------------------------------\n");

        List<Demo> list2 = Arrays.asList(
                new Demo("Adkham"),
                new Demo("John"),
                new Demo("Sardor"),
                new Demo("Rahul"),
                new Demo("Michel"));

        list2.forEach(e -> {System.out.println(e.getName());
        });
        System.out.println("----------------------------------\n");

        list2.forEach(System.out::println);

    }
}
