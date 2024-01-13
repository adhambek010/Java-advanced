package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
    public static void main(String[] args) {
        FileWriter writer = null;
        FileReader reader = null;

        try {
            reader = new FileReader(ByteStreamDemo.FILE_LOCATION);
            writer = new FileWriter(ByteStreamDemo.FILE_LOCATION,true);

            String newData = "";
            int val = reader.read();
            while (val != -1){
                newData += (char)val;
                val = reader.read();
            }
            System.out.println(newData);

            Thread.sleep(500);

            char[] c = newData.toCharArray();
            writer.write(c);
            writer.close();
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}
