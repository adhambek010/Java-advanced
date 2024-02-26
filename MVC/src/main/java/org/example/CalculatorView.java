package org.example;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private JTextField firstNumberadd = new JTextField(10);
    private JLabel additionLabeladd = new JLabel("+");
    private JTextField secondNumberadd = new JTextField(10);
    private JButton calculateButtonadd = new JButton("Calculate");
    private JTextField calcSolutionadd = new JTextField(10);

    public CalculatorView() {
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(firstNumberadd);
        calcPanel.add(additionLabeladd);
        calcPanel.add(secondNumberadd);
        calcPanel.add(calculateButtonadd);
        calcPanel.add(calcSolutionadd);

        this.add(calcPanel);
    }

    public int getFirstNumberadd() {
        return Integer.parseInt(firstNumberadd.getText());
    }

    public int getSecondNumberadd() {
        return Integer.parseInt(secondNumberadd.getText());
    }

    public int getCalcSolutionadd() {
        return Integer.parseInt(calcSolutionadd.getText());
    }

    public void setCalcSolutionadd(int solution) {
        this.calcSolutionadd.setText(Integer.toString(solution));
    }

    public void addCalcListener(ActionListener listener) {
        calculateButtonadd.addActionListener(listener);
    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}