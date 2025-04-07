package annotaions;

import java.lang.reflect.Method;

public class Main {
	
	@CustomAnnotaion(value = 10)
	public void print() {
		System.out.println("My custom annotation");
	}
	
	public static void main(String[] args) throws Exception {
		Main main = new Main();
		Method methodValue = main.getClass().getMethod("print");
		
		CustomAnnotaion annotaion = methodValue.getAnnotation(CustomAnnotaion.class);
		System.out.println("The value is: " + annotaion.value());
		
	}
}
