package com.guideme.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.guideme.collections.CollectionHelper;

public class FindDuplicateElements {

	public static void main2(String[] args) {
		Integer[] arr = { 1, 2, 5, 6, 8, 7, 4, 1, 4, 7, 1 };
		List<Integer> list = Arrays.asList(arr);
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer i : list) {
			Integer count = map.get(i);
			map.put(i, count == null ? 1 : count + 1);
		}

		map.entrySet().forEach(p -> System.out.println("Key :" + p.getKey() + " and count is :" + p.getValue()));
	}

	public static void main(String[] args) {
		List<String> list = CollectionHelper.populateList();

		Map<String, Integer> map = new HashMap<>();
		for (String i : list) {
			Integer count = map.get(i);
			map.put(i, count == null ? 1 : count + 1);
		}

		map.entrySet().forEach(p -> System.out.println("Key :" + p.getKey() + " and count is :" + p.getValue()));
	}
}
