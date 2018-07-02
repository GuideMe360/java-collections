package com.guideme.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RandomTest {
	public static void main1(String[] args) {
		Student1 s1 = new Student1("Dennis", "John", 5);
		Student1 s2 = new Student1("Phil", "Coulson", 2);
		Student1 s3 = new Student1("Mathew", "Baristow", 1);
		List<Student1> lists = Arrays.asList(s1, s2, s3);
		Collections.sort(lists);
		lists.forEach(p -> System.out.println(p));
		Map<String, Student1> result = lists.stream().collect(Collectors.toMap(list -> "", list -> list));
		result.entrySet().forEach(p -> System.out.println(p.getKey() +".."+p.getValue()));

	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Arun", "Ananth", "Arun");
		Set<String> set = list.stream().collect(Collectors.toCollection(TreeSet :: new));
		set.add(null);
		//set.add("");
		set.forEach(p -> System.out.println(">> Unique Value : " + p));
	}
}

class Student1 implements Comparable<Student1> {
	private String firstname, lastname;
	private int rollNo;

	public Student1(String firstname, String lastname, int rollNo) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.rollNo = rollNo;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", lastname=" + lastname + ", rollNo=" + rollNo + "]";
	}

	@Override
	public int compareTo(Student1 o) {
		if (this.rollNo > o.getRollNo()) {
			return 1;
		} else {
			return -1;
		}
	}

}