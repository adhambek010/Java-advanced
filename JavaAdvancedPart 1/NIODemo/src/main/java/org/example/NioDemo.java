package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioDemo {
    public static final String FILE_LOCATION = "C:\\JavaLearning\\JavaAdvanced\\JavaAdvancedPart 1\\InputOutput\\src\\main\\resources\\FileReader.txt";

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_LOCATION);
        FileChannel readChannel = fis.getChannel();
        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
        int result = readChannel.read(readBuffer);
        System.out.println("File read Successfully "+result);

        FileOutputStream fos = new FileOutputStream("C:\\JavaLearning\\JavaAdvanced\\JavaAdvancedPart 1\\NIODemo\\src\\main\\resources\\nio.txt");
        FileChannel writeChannel = fos.getChannel();
        ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
        String msg = "This is tested string";
        writeBuffer.put(msg.getBytes());
        writeBuffer.flip();
        writeChannel.write(writeBuffer);
        System.out.println("File written Successfully");

        fos.close();
        fis.close();

    }
}