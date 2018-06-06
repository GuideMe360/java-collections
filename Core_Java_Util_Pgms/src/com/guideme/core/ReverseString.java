package com.guideme.core;

public class ReverseString {

	public static void stringReverseMe(String s) {
		char a[] = s.toCharArray();
		reverseMe(a);
	}

	private static void reverseMe(char[] a) {
		StringBuilder sb = new StringBuilder();
		for (int i = a.length - 1; i >= 0; i--) {
			sb.append(a[i]);
		}
		System.out.println("Reverse String :" + sb);
	}

	public static void numberReverseMe(int number) {
		int reverse = 0;
		while (number != 0) {
			/*System.out.println("reverse * 10 :" + (reverse * 10));
			System.out.println("number % 10 :" + (number % 10));
			System.out.println("number :" + number / 10);*/
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
		}
		System.out.println("Reverse Number :" + reverse);
	}

	public static void main(String[] args) {
		ReverseString.stringReverseMe("GuideMe");
		ReverseString.numberReverseMe(156665463);
	}

}
