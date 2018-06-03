package com.guideme.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		List<String> list = CollectionHelper.populateList();
		CollectionHelper.printList(list);
		System.out.println("==================================");
		Set<String> newList = new HashSet<String>(list);
		CollectionHelper.printList(newList);
	}
}
