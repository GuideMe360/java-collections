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
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "AFirst");
		map.put(3, "BThree");
		map.put(2, "CSecond");
		map.put(null, "DFour");
		
		  
		System.out.println("===============| Print Map<Integer , String> List |================");
		for (Map.Entry entry : map.entrySet()) {
			System.out.println("Key :" + entry.getKey() + " / Value: " + entry.getValue());
		}

	}

}
