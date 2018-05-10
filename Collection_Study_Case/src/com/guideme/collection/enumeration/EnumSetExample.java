package com.guideme.collection.enumeration;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetExample {

	enum days {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<days> set = EnumSet.of(days.MONDAY,days.WEDNESDAY);
		for(days day : set) {
			System.out.println("Data :"+day);
		}
		
		Set<days> set1 = EnumSet.allOf(days.class);
		for(days day : set1) {
			System.out.println("Data :"+day);
		}
		
		Set<days> set2 = EnumSet.noneOf(days.class);  
	    System.out.println("Week Days:"+set2);     
	}

}
