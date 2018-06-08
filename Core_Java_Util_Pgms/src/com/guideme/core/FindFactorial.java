package com.guideme.core;

import java.util.Calendar;

public class FindFactorial {

	public static void main(String[] args) {
		int fact = 6;
		int result = 1;
		while (fact != 0) {
			result = result * fact;
			fact--;
		}
		System.out.println("Result :" + result);
	}

	public static void main2(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1987145452);
		if ((cal.getActualMaximum(Calendar.DAY_OF_YEAR)) > 365) {
			System.out.println("Its Leap Year");
		} else {
			System.out.println("Its Not Leap Year");
		}
	}

	public static void main1(String[] args) {
		int i = 47862, n, sum = 0;
		while (i > 0) {
			n = i % 10;
			sum = sum + n;
			i = i / 10;
		}
		System.out.println(">>> :"+sum);

	}
}
