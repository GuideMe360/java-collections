package com.guideme.core;

public class MyDisticntElements {

	public static void main(String[] args) {
		int[] nums = { 5, 2, 7, 2, 4, 7, 8, 2, 3 };

		int length = nums.length - 1;

		for (int i = 0; i < length; i++) {
			boolean isDistinct = false;
			for (int j = 0; j < i; j++) {
				if (nums[i] == nums[j]) {
					isDistinct = true;
					break;
				}
			}
			if (!isDistinct) {
				System.out.println(">>>> :" + nums[i]);
			}
		}
	}

}
