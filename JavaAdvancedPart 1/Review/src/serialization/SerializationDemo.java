package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {

		// Serialization:
		Student student = new Student(1, "John", "Brown", 20);
		String fileName = "src/serialization/notes.ser";
		FileOutputStream fileOut = null;
		ObjectOutputStream objOut = null;
		
		try {
			fileOut = new FileOutputStream(fileName);
			objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(student);
			
			objOut.close();
			fileOut.close();
			System.out.println("Object has been serialized: \n" + student);
		}catch(IOException ex) {
			System.err.println(ex.getMessage());
		}
		
		// Deserialization:
		FileInputStream fileIn = null;
		ObjectInputStream objIn = null;
		
		try {
			fileIn = new FileInputStream(fileName);
			objIn = new ObjectInputStream(fileIn);
			
			Student serializedStudent = (Student) objIn.readObject();
			System.out.println("Object has been deserialized: \n" + serializedStudent);
			
			objIn.close();
			objOut.close();
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
		
	}

}
