package com.guideme.collection.adhoc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTester {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		fillData(map);

		map.forEach((k, v) -> System.out.printf("%s%s%n", k, v));
		map.put("firatname", " lastname");
		map.forEach((k, v) -> System.out.printf("%s%s%n", k, v));
		
		String[] strings = keysAsArray(map);
	}
	
	 private static String[] keysAsArray(Map<String, String> map) {
	        return map.keySet().toArray(new String[map.keySet().size()]);
	    }

	    // assumes the key is of type String
	    private static List<String> keysAsList(Map<String, String> map) {
	        List<String> list = new ArrayList<String>(map.keySet());
	        return list;
	    }

	private static void fillData(Map<String, String> map) {
		map.put("Android", " Mobile");
		map.put("Eclipse IDE", " Java");
		map.put("Eclipse RCP", " Java");
		map.put("Git", " Version control system");

	}

}
