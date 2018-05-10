package com.guideme.collection.enumeration;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {

	enum days {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumMap<days, String> map = new EnumMap<days, String>(days.class);
		map.put(days.MONDAY, "Arun");
		map.put(days.THRUSDAY, "Ananth");
		map.put(days.WEDNESDAY, "Jeni");
		map.put(days.SATURDAY, "Raaji");

		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}

}
