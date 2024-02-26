package org.example;

import lombok.Getter;

@Getter
public class CalculatorModel {
    private int calculationValue;

    public void addTwoNumbers(int firstNum, int secondNum) {
        calculationValue = firstNum + secondNum;
    }
}