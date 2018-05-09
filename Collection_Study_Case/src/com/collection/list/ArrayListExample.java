package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Arun");
		list.add("Nancy");
		list.add("Ananth");

		iterateList(list);		
		list.remove("Nancy");
		System.out.println("========================");
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
