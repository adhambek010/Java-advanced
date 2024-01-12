package org.example;

import org.example.student.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Student student = new Student("Adham", "Salaydinov",22);
        student.display();
    }
}