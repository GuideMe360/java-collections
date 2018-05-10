/**
 * 
 */
package com.guideme.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arun
 *
 */
public class HashMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap();
		map.put(1,"AFirst");
		map.put(3,"BThree");
		map.put(2,"CSecond");
		
		System.out.println("===============| Print Map<Integer , String> List |================");
		printIntMap(map);
		
		Map<String, String> map1 = new HashMap();
		map1.put("C","One");
		map1.put("A","Two");
		map1.put("B","Three");
				
		System.out.println("===============| Print Map<String , String> List |================");
		printStringMap(map1);
		
		map1.remove("A");
		
		System.out.println("===============| Print Map<String , String> List After Removing Element|================");
		printStringMap(map1);
	}

	private static void printStringMap(Map<String, String> map1) {
		for(Map.Entry entry : map1.entrySet()) {
			System.out.println("Key :"+entry.getKey()+" / Value: "+entry.getValue());			
		}
	}

	private static void printIntMap(Map<Integer, String> map) {
		for(Map.Entry entry : map.entrySet()) {
			System.out.println("Key :"+entry.getKey()+" / Value: "+entry.getValue());			
		}
	}

}
