package com.java.leetCode;

public class TwoSum {
	/**
	 * Given an array of integers nums and an integer target, return indices of the two 
	 * numbers such that they add up to target.
	 *You may assume that each input would have exactly one solution, 
	 *and you may not use the same element twice.
	 *You can return the answer in any order.
	 */

	public static void main(String[] args) {
		int[] nums = {3,3};
		int target = 6;
		int[] arry = twoSum(nums, target);
		for(int a : arry) {
			System.out.println(a);
		}
		
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] arry = new int[2];
		int num = 0;
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				num = nums[i] + nums[j];
				if(num == target) {
					if(nums[i] <= nums[j]) {
						arry[0] = i;
						arry[1] = j;
						break;
					}else {
						arry[0] = j;
						arry[1] = i;
						break;
					}
				}
			}
		}
		return arry;
		
	}
}
