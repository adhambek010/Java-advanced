package org.example.enums;

public enum LearningEnum {
    RED("red"), GREEN("green"), BLUE("blue");

    private String value;

    private LearningEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

