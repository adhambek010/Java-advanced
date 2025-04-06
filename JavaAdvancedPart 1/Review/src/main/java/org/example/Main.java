package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("Adkham", "Lodz POland", 23);
        System.out.println(std1);

        final String File_Name = "C:\\JavaLearning\\JavaAdvanced\\JavaAdvancedPart 1\\Serialization\\src\\main\\resources\\std.ser";

        // Serialization
        try {
            System.out.println("Object Serialization is started....\n");
            FileOutputStream fos = new FileOutputStream(File_Name);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(std1);
            fos.close();
            oos.close();
            System.out.println("Object Serialization is finished!");
        }catch (IOException e){
            System.err.println(e.toString());
            e.printStackTrace();
        }

        // Deserialization
        try {
            System.out.println("\nDeserialization is started...");
            FileInputStream fis = new FileInputStream(File_Name);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student std2 = (Student) ois.readObject();
            System.out.println("Deserialization is finished!");
            System.out.println(std2);

            int size = fis.available();
            byte[] bs = new byte[size];
            fis.read(bs);
            String data = new String(bs);
            System.out.println("This is serialized text : "+data);

            fis.close();
            ois.close();
        }catch(IOException | ClassNotFoundException e) {
            System.err.println(e.toString());
            e.printStackTrace();
        }
    }
}