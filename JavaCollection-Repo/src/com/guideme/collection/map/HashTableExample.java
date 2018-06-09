/**
 * 
 */
package com.guideme.collection.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author Arun
 *
 */
public class HashTableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(1, "AFirst");
		map.put(3, "BThree");
		map.put(2, "CSecond");
		// map.put(4, null);

		System.out.println("===============| Print HashTable<Integer , String> List |================");
		for (Map.Entry entry : map.entrySet()) {
			System.out.println("Key :" + entry.getKey() + " / Value: " + entry.getValue());
		}
		map.remove(3);

		System.out.println("===============| Print HashTable<Integer , String> List After Remove|================");
		for (Map.Entry entry : map.entrySet()) {
			System.out.println("Key :" + entry.getKey() + " / Value: " + entry.getValue());
		}

		Enumeration keys = map.keys();
		while (keys.hasMoreElements()) {
			System.out.println("Hash>>>> :"+keys.nextElement());
			System.out.println("Hash>>>> :"+keys.hashCode());
		}
	}

}
