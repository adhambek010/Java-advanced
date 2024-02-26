package org.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController implements ActionListener {
    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalcListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int firstNumber = theView.getFirstNumberadd();
            int secondNumber = theView.getSecondNumberadd();

            theModel.addTwoNumbers(firstNumber, secondNumber);

            theView.setCalcSolutionadd(theModel.getCalculationValue());
        } catch (NumberFormatException ex) {
            theView.displayErrorMessage("Invalid input. Please enter valid numbers.");
        }
    }
}
