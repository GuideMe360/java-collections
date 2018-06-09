package com.guideme.core;

public class NumSumExample {

	public static void main1(String[] args) {
		int num = 1234;
		int[] digits = Integer.toString(num).chars().map(c -> c - '0').toArray();
		int sum = 0;
		for (int d : digits)
			sum = sum + d;
		System.out.println("Final Sum :" + sum);
	}
	
	public static void main(String[] args) {
		int i = 25;
	}

}
