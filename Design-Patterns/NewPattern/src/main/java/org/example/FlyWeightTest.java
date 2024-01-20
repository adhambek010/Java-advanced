package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FlyWeightTest extends JFrame {

    private JButton startDrawing;
    private int windowWidth = 1950;
    private int windowHeight = 1040;

    private Color[] shapeColour = {Color.orange, Color.red, Color.yellow, Color.black, Color.pink,
            Color.cyan, Color.magenta, Color.black, Color.gray
    };

    public FlyWeightTest(){
        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Frame Test");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        final JPanel drawingPanel = new JPanel();
        startDrawing = new JButton("Draw Stuff");

        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Graphics g = drawingPanel.getGraphics();
                long startTime = System.currentTimeMillis();
                for (int i = 0; i < 100_0; i++){
                    g.setColor(getRandColor());
                    g.fillRect(getRandX(), getRandY(), getRandX(), getRandY());
                }
                long endTime = System.currentTimeMillis();
                System.out.println("That took " + (endTime - startTime));
            }
        });
        this.add(contentPane);
        this.setVisible(true);
    }
    private Color getRandColor(){
        Random random = new Random();
        int randInt = random.nextInt(shapeColour.length);
        return shapeColour[randInt];
    }

    private int getRandX(){
        return (int) (Math.random() * windowWidth);
    }
    private int getRandY(){
        return (int) (Math.random() * windowHeight);
    }

    public static void main(String[] args) {
        new FlyWeightTest();
    }

}