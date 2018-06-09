package com.guideme.collection.adhoc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDuplicatesExample {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		int my_array[] = { 1, 2, 3, 4, 3, 1, 2 };

		for (int i = 0; i <= my_array.length - 1; i++) {
			for (int j = 0; j < my_array.length; j++) {
				if ((my_array[i] == my_array[j]) && (i != j)) {
					System.out.println("Duplicate Element :" + my_array[j]);
				}
			}
		}
	}

	public static void main2(String[] args) {
		// TODO Auto-generated method stub
		int my_array[] = { 1, 2, 3, 4, 3, 1, 2 };
		Map<Integer, Integer> rep = new HashMap();
		for (int i = 0; i <= my_array.length - 1; i++) {
			int item = my_array[i];
			if (rep.containsKey(item)) {
				rep.put(item, rep.get(item) + 1);
			} else {
				rep.put(item, 1);
			}
		}

		StringBuilder sb = new StringBuilder();
		int overAllCount = 0;
		for (Map.Entry<Integer, Integer> entry : rep.entrySet()) {
			if (entry.getValue() > 1) {
				overAllCount += 1;

				sb.append("\n");
				sb.append(entry.getKey());
				sb.append(": ");
				sb.append(entry.getValue());
				sb.append(" times");
			}
		}
		if (overAllCount > 0) {
			sb.insert(0, " repeated numbers:");
			sb.insert(0, overAllCount);
			sb.insert(0, "There are ");
		}

		System.out.print(sb.toString());
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("arun");
		list.add("ban");
		list.add("can");
		list.add("can");
		list.add("arun ");
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("a");
		// System.out.println(">>>> Freq : "+Collection.frequency(list,'a'));
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String temp : list) {
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : "
				+ entry.getValue());
		}
		

	}

}
