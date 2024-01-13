package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    public static final String FILE_LOCATION = "C:\\JavaLearning\\JavaAdvanced\\JavaAdvancedPart 1\\InputOutput\\src\\main\\resources\\FileReader.txt";

    public static final String DATA = """ 
            Java is a high-level, class-based, object-oriented programming language that is designed 
            to have as few implementation dependencies as possible. It is a general-purpose programming 
            language intended to let programmers write once, run anywhere meaning that compiled 
            Java code can run on all platforms that support Java without the need to recompile.
            """;

    public static void main(String[] args) {
        FileOutputStream outputStream = null;
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(FILE_LOCATION);
            outputStream = new FileOutputStream(FILE_LOCATION);

            outputStream.write(DATA.getBytes());

            Thread.sleep(500);

            int size = inputStream.available();
            byte[] b = new byte[size];
            inputStream.read(b);
            String newData = new String(b);

            System.out.println(newData);

            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.err.println(e.toString());
            e.printStackTrace();
        }
    }
}
