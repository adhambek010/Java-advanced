package nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioDemo {
	public static void main(String[] args) throws IOException {
		String sourceFile = "C:\\JavaLearning\\JavaAdvanced\\JavaAdvancedPart 1\\Review\\src\\io\\source.txt";
		int size = 1024;
		FileInputStream fis = new FileInputStream(sourceFile);
		
		FileChannel readChannel = fis.getChannel();
		ByteBuffer readBuffer = ByteBuffer.allocate(size);
		int result = readChannel.read(readBuffer);
		System.out.println("File read successfully + " + result);
		
		String destinationFile = "C:\\JavaLearning\\JavaAdvanced\\JavaAdvancedPart 1\\Review\\src\\nio\\destination.txt";
		FileOutputStream fos = new FileOutputStream(destinationFile);
		
		FileChannel writeChannel = fos.getChannel();
		ByteBuffer writeBuffer = ByteBuffer.allocate(size);
		String message = "This is a test String";
		writeBuffer.put((byte) result);
		writeBuffer.put(message.getBytes());
		writeBuffer.flip();
		writeChannel.write(writeBuffer);
		fis.close();
		fos.close();
		System.out.println("File written successfully");
		
	}
}
