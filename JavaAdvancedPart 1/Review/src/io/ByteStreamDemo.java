package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) {
		String sourceFile = "C:\\JavaLearning\\JavaAdvanced\\JavaAdvancedPart 1\\Review\\src\\io\\source.txt";
		String destinationFile = "C:\\JavaLearning\\JavaAdvanced\\JavaAdvancedPart 1\\Review\\src\\io\\destination.txt";
        
        try (FileInputStream input = new FileInputStream(sourceFile)) {
            int content;
            while ((content = input.read()) != -1) {
                System.out.print((char) content);
            }
            System.out.println();
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        
        try(FileInputStream input = new FileInputStream(sourceFile);
        		FileOutputStream output = new FileOutputStream(destinationFile)){
        	
        	int content;
			while ((content = input.read()) != -1) {
				output.write(content);
			}
			
			System.out.println("Content has been written");
        }catch (IOException ex) {
			System.err.println("Error " + ex.getMessage());
		}
    }
}
