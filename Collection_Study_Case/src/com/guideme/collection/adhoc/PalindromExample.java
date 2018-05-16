package com.guideme.collection.adhoc;

public class PalindromExample {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		String lit = "AAAs1AAA";
		char ch[] = lit.toCharArray();
		boolean isPalindrome = isPalindrome(ch, lit);
		System.out.println("Is Boolean :" + isPalindrome);
	}

	private static boolean isPalindrome(char[] ch) {
		boolean isPalindrome = false;
		for (int i = 0; i <= ch.length - 1; i++) {
			for (int j = ch.length - 1; j >= 0; j--) {
				String ii = ch[i] + "";
				String jj = ch[j] + "";
				if (ii.equals(jj)) {
					isPalindrome = true;
				} else {
					isPalindrome = false;
				}
			}
		}
		return isPalindrome;
	}

	private static boolean isPalindrome(char[] ch, String str) {
		boolean isPalindrome = false;
		String rev = "";
		for (int j = ch.length - 1; j >= 0; j--) {
			rev = rev + ch[j];
		}
		if (str.equals(rev)) {
			isPalindrome = true;
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		int reminder, sum = 0, temp, data = 1211;
		temp = data;

		while (data > 0) {
			reminder = data % 10;
			System.out.println("Remimdar :" + reminder);
			sum =   (sum * 10) + reminder;
			System.out.println("Sum :" + sum);
			data = data / 10;
			System.out.println("Data :" + data);
		}

		if (temp == sum) {
			System.out.println("Its Palindrome");
		} else {
			System.out.println("Its Not Palindrome");
		}

	}
}
