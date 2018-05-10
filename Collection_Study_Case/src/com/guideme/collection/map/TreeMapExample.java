/**
 * 
 */
package com.guideme.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import com.guideme.collection.list.dto.Book;

/**
 * @author Arun
 *
 */
public class TreeMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "AFirst");
		map.put(3, "BThree");
		map.put(2, "CSecond");
		//map.put(null, "DFour");
		
		  
		System.out.println("===============| Print Map<Integer , String> List |================");
		for (Map.Entry entry : map.entrySet()) {
			System.out.println("Key :" + entry.getKey() + " / Value: " + entry.getValue());
		}
		
		
		System.out.println("===============| Print Map<Integer , String> List After Remove|================");
		for (Map.Entry entry : map.entrySet()) {
			System.out.println("Key :" + entry.getKey() + " / Value: " + entry.getValue());
		}
		
		Book b1 = new Book(101, "Arun", "Guide", "Jaaras", 50);
		Book b2 = new Book(102, "Arun2", "Guide", "Jaaras", 50);
		Book b3 = new Book(103, "Arun3", "Guide", "Jaaras", 50);
		
		LinkedHashMap<Integer, Book> bookMap = new LinkedHashMap<Integer, Book>();
		bookMap.put(101, b1);
		bookMap.put(102, b2);
		bookMap.put(103, b3);
		
		System.out.println("===============| Print Map<Integer , Book> List |================");
		for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
			Book book = entry.getValue();
			System.out.println("Name :"+book.getName() +"/ Author:"+book.getAuthor());
		}
		
	}

}
