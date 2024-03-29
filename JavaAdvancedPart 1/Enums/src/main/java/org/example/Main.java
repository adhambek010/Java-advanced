package org.example;

import org.example.enums.LearningEnum;

public class Main {
    public static void main(String[] args) {
        LearningEnum enum1 = LearningEnum.RED;

        System.out.println("Red Enum name : " + enum1.name());
        System.out.println("Red Enum value : " + enum1.getValue());

        for(LearningEnum enum2 : LearningEnum.values()) {
            System.out.println("Enum value : " + enum2.getValue());
        }

        for(LearningEnum enum3 : LearningEnum.values()){
            System.out.println("Enum name : " + enum3.name());
        }

    }
}