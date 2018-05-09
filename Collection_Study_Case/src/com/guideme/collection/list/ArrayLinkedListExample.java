package com.guideme.collection.list;

import java.util.LinkedList;
import java.util.List;

import javax.swing.plaf.synth.SynthStyle;

public class ArrayLinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		list.add("Arun");
		list.add("Nancy");
		list.add("Surya");
		list.add("Jenitha");
		list.add("Raaji");
		list.add("");
		list.add("Surya");
		list.add(null);
		list.add(2,"Test");
		list.addFirst("Add First");
		list.addLast("Add Last");

		System.out.println("===============| Print Linked List |================");
		iterateList(list);
		System.out.println("Index of :"+list.get(5));
		System.out.println("Last index of :"+list.get(2));
		
		System.out.println("===============| Print Linked List After Clone|================");
		 LinkedList llist2 = new LinkedList();
		 llist2 = (LinkedList) list.clone();
		 llist2.add("New List Element");
		 iterateList(llist2);
	}

	private static void iterateList(List<String> list) {
		for (String s : list) {
			System.out.println("List Data :" + s);
		}
	}

}
