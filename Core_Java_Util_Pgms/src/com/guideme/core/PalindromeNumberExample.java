package com.guideme.core;

import java.util.Scanner;

public class PalindromeNumberExample {

	public static void main(String[] args) {
		//int palindrome = new Scanner(System.in).nextInt();
		//System.out.println(">>>>> :" + isPalindrome(palindrome));
		System.out.println(">>>>> :" + isPalindrome(121));
	}

	public static boolean isPalindrome(int number) {
		int palin = number;
		int reverse = 0;
		while (palin != 0) {
			int remainder = palin % 10;
			System.out.println("remainder :"+remainder);
			reverse = reverse * 10 + remainder;
			System.out.println("reverse :"+reverse);
			palin = palin / 10;
			System.out.println("palin :"+palin);
		}
		System.out.println(">>>>>> :" + reverse);
		if (number == reverse)
			return true;

		return false;
	}
}
