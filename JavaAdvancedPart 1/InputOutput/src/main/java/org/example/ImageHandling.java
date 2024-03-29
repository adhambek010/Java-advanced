package org.example;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * @author Adkham
 *
 *
 */
public class ImageHandling {

    public static void main(String[] args) {

        int width = 963;
        int height = 640;

        String fileName = "C:\\JavaLearning\\JavaAdvanced\\JavaAdvancedPart 1\\src\\com\\java\\advanced\\io\\IO hierarchy.png";
        BufferedImage image = null;

        image = readFromFile(width, height, fileName, image);

        writeToFile(image);
    }

    private static BufferedImage readFromFile(int width, int height, String fileName, BufferedImage image) {

        try {
            File sampleFile = new File(fileName);
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            image = ImageIO.read(sampleFile);

            System.out.println("Readeing complete. "+image);
        } catch (IOException e) {
            System.err.println(e.toString());
            e.printStackTrace();
        }

        return image;
    }

    private static void writeToFile(BufferedImage image) {

        try {
            Thread.sleep(5000);
            File output = new File("C:\\JavaLearning\\JavaAdvanced\\JavaAdvancedPart 1\\InputOutput\\src\\main\\resources\\copyImage.png");

            ImageIO.write(image, "png", output);

            System.out.println("Writing is complete.");
        } catch (IOException e) {
            System.err.println(e.toString());
            e.printStackTrace();
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }

}
