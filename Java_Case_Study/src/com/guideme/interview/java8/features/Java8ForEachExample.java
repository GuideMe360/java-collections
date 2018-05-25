/**
 * Author :Arun Ammasai
 * JAVA/J2EE Programmer
 * 25-May-2018
 */
package com.guideme.interview.java8.features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Arun
 *
 */
public class Java8ForEachExample {

	/**
	 * @param args
	 */
	public static void main1(String[] args) {
		List<Integer> intList = popuateList();

		Iterator<Integer> iter = intList.iterator();
		while (iter.hasNext()) {
			Integer i = (Integer) iter.next();
			System.err.println("Iterator Value :" + i);
		}

		intList.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println("For each anonymous value :" + t);

			}
		});
	}

	private static List<Integer> popuateList() {
		List<Integer> intList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			intList.add(i);
		}
		return intList;
	}

	public static void main2(String[] args) {
		List<Integer> intList = popuateList();
		MyConsumer myConsumer = new MyConsumer();
		intList.forEach(myConsumer);
	}

	public static void main(String[] args) {
		List<StudentDTO> list = populateStudentSto();
		list.forEach(new Consumer<StudentDTO>() {

			@Override
			public void accept(StudentDTO t) {
				System.out.println("First Name :"+t.getFirstName()+" / Last Name :"+t.getLastName());
			}
			
		});
	}

	/**
	 * @return
	 */
	private static List<StudentDTO> populateStudentSto() {
		List<StudentDTO> list = new ArrayList<>();
		StudentDTO s1 = new StudentDTO("NancyMaria", "ArulRaj");
		StudentDTO s2 = new StudentDTO("Arun", "Ammasai");
		StudentDTO s3 = new StudentDTO("Dennis", "John");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		return list;
	}

}

class MyConsumer implements Consumer<Integer> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.function.Consumer#accept(java.lang.Object)
	 */
	@Override
	public void accept(Integer t) {
		System.out.println("For each anonymous value :" + t);

	}
}

class StudentDTO {
	private String firstName, lastName;

	public StudentDTO(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
