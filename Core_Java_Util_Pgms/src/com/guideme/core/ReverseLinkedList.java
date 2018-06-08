package com.guideme.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseLinkedList {

	public static void main1(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("ABC");
		list.add("DEF");
		list.add("GHI");
		for (String str : list) {
			System.out.println(">>>>>>> :" + str);
		}
		Collections.reverse(list);
		System.out.println("After Reverse");
		for (String str : list) {
			System.out.println(">>>>>>> :" + str);
		}

		System.out.println("After Reverse One");
		list.sort(Comparator.reverseOrder());
		System.out.println("after sorting: " + list);
	}

	public static void main(String[] args) {
		int[] input = { 60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40 };
		List<Integer> intList = Arrays.stream(input).boxed().collect(Collectors.toList());
		for (Integer i : intList) {
			System.out.println(">>>>> Before Sort:" + i);
		}
		System.out.println("===========================================================");
		Collections.sort(intList);

		for (Integer i : intList) {
			System.out.println(">>>>> After Sort:" + i);
		}

	}

}
