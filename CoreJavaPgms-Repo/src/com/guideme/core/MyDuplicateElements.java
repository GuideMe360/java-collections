package com.guideme.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyDuplicateElements {

	public static void main1(String[] args) {
		int[] input = { 2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12 };

		int[] output = new int[input.length - 1];
		Map<Integer, Integer> listInt = new HashMap<>();
		for (int i : input) {
			if (listInt.containsKey(i)) {
				System.out.println(">>>> :" + i);
			} else {
				listInt.put(i, i);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] input = { 2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12 };
		List<Integer> listWithDuplicates = Arrays.stream(input).boxed().collect(Collectors.toList());
	    List<Integer> listWithoutDuplicates = listWithDuplicates.stream().distinct().collect(Collectors.toList());
	    listWithoutDuplicates.forEach(p -> System.out.println(">>> :"+p));
	}

}
