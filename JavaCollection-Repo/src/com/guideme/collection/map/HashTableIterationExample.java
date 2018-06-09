package com.guideme.collection.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableIterationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(8, "Arun");
		map.put(3, "Nancy");
		map.put(5, "Ananth");
		map.remove(5);  
		Iterator<Integer> itr = map.keySet().iterator();

		for (Map.Entry m : map.entrySet()) {
			System.out.println("Key :" + m.getKey() + "/ Value :" + m.getValue());
		}
	}

}
