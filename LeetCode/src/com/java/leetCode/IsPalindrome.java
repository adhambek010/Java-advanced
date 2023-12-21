package com.java.leetCode;

public class IsPalindrome {

	public static void main(String[] args) {
		
		int number = 1234321;
		System.out.println(isPalindrome(number));

	}
	
	public static boolean isPalindrome(int number) {
		
		int newNum = 0;
		int copyNum = number;
		
		while(copyNum > 0) {
			int ld = copyNum % 10;
			newNum = (newNum * 10) + ld;
			copyNum /= 10;
		}
		
		return newNum == number;
	}

}
