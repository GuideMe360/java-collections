package com.guideme.collection.list;

import java.util.LinkedList;
import java.util.List;

public class ArrayLinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<>();
		list.add("Arun");
		list.add("Nancy");
		list.add("Ananth");

		iterateList(list);		
		list.remove("Nancy");
		System.out.println("=========Linked List==========");
		iterateList(list);
		list.removeAll(list);
		System.out.println("========================");
		iterateList(list);
	}

	private static void iterateList(List<String> list) {
		for (String s : list) {
			System.out.println("List Data :"+s);
		}
	}

}
