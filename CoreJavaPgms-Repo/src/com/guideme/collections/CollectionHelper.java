package com.guideme.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionHelper {
	public static List<String> populateList() {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");
		list.add("Apple");
		list.add("Mango");
		return list;
	}

	public static void printList(Set<String> newList) {
		newList.forEach(p -> System.out.println("Modified :" + p));
	}
	
	public static void printList(List<String> newList) {
		newList.forEach(p -> System.out.println("Modified :" + p));
	}
}
