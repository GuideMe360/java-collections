/**
 * Author :Arun Ammasai
 * JAVA/J2EE Programmer
 * 27-May-2018
 */
package com.guideme.interview.java8.features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Arun
 *
 */
public class Java8StreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(15);
		intList.add(5);
		intList.add(9);
		intList.add(25);
		intList.add(11);
		Iterator<Integer> it = intList.iterator();
		int sum = 0;
		while (it.hasNext()) {
			int num = it.next();
			if (num > 10) {
				sum += num;
			}
		}
		System.out.println("Sum :"+sum);
		
		useJava8Feature(intList);
	}

	/**
	 * @param intList
	 */
	private static void useJava8Feature(List<Integer> intList) {
		System.out.println("JAVA 8 :"+intList.stream().filter(i -> i > 10).mapToInt(i -> i).sum());
	}

}
