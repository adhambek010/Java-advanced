package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {

	public static void main(String[] args) {
		String sourceFile = "C:\\JavaLearning\\JavaAdvanced\\JavaAdvancedPart 1\\Review\\src\\io\\source.txt";
		String destinationFile = "C:\\JavaLearning\\JavaAdvanced\\JavaAdvancedPart 1\\Review\\src\\io\\destination.txt";
		
		 try (FileReader reader = new FileReader(sourceFile)) {
	            int content;
	            System.out.println("Content from 'note.txt':");
	            while ((content = reader.read()) != -1) {
	                System.out.print((char) content);
	            }
	            System.out.println();

	        } catch (IOException ex) {
	            System.err.println("Error reading the file: " + ex.getMessage());
	        }

	        
	        try (FileReader reader = new FileReader(sourceFile);
	             FileWriter writer = new FileWriter(destinationFile)) {
	            int content;
	            while ((content = reader.read()) != -1) {
	                writer.write(content);
	            }
	            System.out.println("Content has been written to 'output.txt'.");
	        } catch (IOException ex) {
	            System.err.println("Error writing to the file: " + ex.getMessage());
	        }
	}

}
