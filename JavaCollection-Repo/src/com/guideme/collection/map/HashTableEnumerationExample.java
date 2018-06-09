package com.guideme.collection.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashTableEnumerationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(001, "Arun");
		map.put(002, "Ananth");
		Integer key;
		Enumeration names = map.keys();
		while(names.hasMoreElements()) {
			key = (Integer)names.nextElement();
			System.out.println("Key :"+key +"/ Value :"+map.get(key));
		}
	}

}
