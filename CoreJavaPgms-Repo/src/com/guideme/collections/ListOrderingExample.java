package com.guideme.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOrderingExample {

	public static void main(String[] args) {
		List<String> list = CollectionHelper.populateList();
		listReverseOrder(list);
		System.out.println("=======================================================");
		createReadOnly(list);
	}

	private static void listReverseOrder(List<String> list) {
		Comparator comp = Collections.reverseOrder();
		Collections.sort(list, comp);
		list.forEach(p -> System.out.println(p));
	}

	private static void createReadOnly(List<String> list) {
		List<String> newList = Collections.unmodifiableList(list);
		newList.add("Test");
	}

}
