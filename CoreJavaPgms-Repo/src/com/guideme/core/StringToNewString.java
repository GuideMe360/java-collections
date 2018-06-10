package com.guideme.core;

import java.util.HashSet;
import java.util.Set;

public class StringToNewString {

	public static void main(String[] args) {
		String s = "Arun"; // return an existing object from String pool
		String s1 = new String("Ananth"); // it always create a new object in heap memory
		System.out.println(String.format("%s - %s", s.hashCode(), s1.hashCode()));

		Set<String> set = new HashSet<>();
		set.add("Arun");
		set.add(null);
		set.add(null);
		set.add("");

		set.stream().forEach(p -> System.out.println("String : " + p));
	}

}
