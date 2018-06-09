package com.guideme.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Arun");
		list.add("Nancy");
		list.add("Surya");
		list.add("Jenitha");
		list.add("Raaji");
		list.add("");
		list.add("Surya");
		list.add(null);
		
		System.out.println("===============| Print Array List |================");
		iterateList(list);
		
		List<String> list1 = new ArrayList<>();
		list1.add("Arun");
		list1.add("Nancy");
		list1.add("Surya");
		list1.add("Jenitha");
		list1.add("Raaji");
		list1.add("");
		list1.add("Surya");
		list1.add(null);
		list1.addAll(list);
		
		System.out.println("===============| Print Array List After Add All|================");
		iterateList(list1);
		
		List<String> list2 = new ArrayList<>();
		list2.add("Arun");
		list2.add("Nancy");
		list2.add("Surya");
		list2.add("Jenitha");
		list2.add("Raaji");
		list2.add("");
		list2.add("Surya");
		list2.add(null);
		list2.addAll(2,list);
		
		System.out.println("===============| Print Array List After Add All Index|================");
		iterateList(list2);
		
		list2.clear();
		
		System.out.println("===============| Print Array List After Clear|================");
		iterateList(list2);
		
		boolean flag = list1.contains("Arun");
		System.out.println("Flag :"+flag);
		
		
		
	}

	private static void iterateList(List<String> list) {
		for (String s : list) {
			System.out.println("List Data :"+s);
		}
	}

}
