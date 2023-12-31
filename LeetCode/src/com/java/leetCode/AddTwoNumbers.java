package com.java.leetCode;

import java.util.LinkedList;

public class AddTwoNumbers {

	/**
	 * You are given two non-empty linked lists representing two non-negative integers. 
	 * The digits are stored in reverse order, and each of their nodes contains a single digit. 
	 * Add the two numbers and return the sum as a linked list.

	 *You may assume the two numbers do not contain any leading zero, except the number 0 itself.
	 * 
	 */
	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();

		l1.add(9);
		l1.add(9);
		l1.add(9);
		l1.add(9);
		
		l2.add(9);
		l2.add(9);
		l2.add(9);
		l2.add(9);
		l2.add(9);
		l2.add(9);
		l2.add(9);
		System.out.println(addTwoNumbers(l1, l2));
		
	}
	
	public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2){
		LinkedList<Integer> result = new LinkedList<>();
		
		int total1 = 0;
		for(Integer i : l1) {
			total1 *= 10;
			total1 += i;
		}
		
		int total2 = 0;
		for(Integer i : l2) {
			total2 *= 10;
			total2 += i;
		}
		
		int total = total1 + total2;
		int[] revNumber = reverseNumber(total);
		
		for(int i = 0; i < revNumber.length; i++) {
			result.add(revNumber[i]);
		}
		
		return result;
	}

	public static int[] reverseNumber(int number) {
		String str = Integer.toString(number);
		int[] revNumber  = new int[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			revNumber[i] += Character.getNumericValue(str.charAt(str.length() - i - 1));
		}
	
		return revNumber;
	}
}
