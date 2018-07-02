package com.guideme.core;

import java.util.Arrays;
import java.util.List;

public class CommonElementsInArray {

	public static void main1(String[] args) {
		int[] arr1 = { 4, 7, 3, 9, 2 };
		int[] arr2 = { 3, 2, 12, 9, 40, 32, 4 };
		for (int i = 0; i <= arr1.length - 1; i++) {
			for (int j = 0; j <= arr2.length - 1; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}

			}
		}
	}

	public static void main(String[] args) {
		String a[] = { "Arun", "Ananth" };
		List<String> list = Arrays.asList(a);
		list.forEach(p -> System.out.println(">>>>> :" + p));
	}
}
