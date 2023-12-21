package com.java.lambda;
interface Lambda1 {
	void demo1();
}

public class IntroLambda1 {

	public static void main(String[] args) {
		Lambda1 lambda1 = (() -> {System.out.println("Statement number 2");
			System.out.println("Statement number 3");}
		);
		lambda1.demo1();
	}

}
