package com.guideme.core;

public class OverrideEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Arun");
		Employee e2 = new Employee("Arun");

		if (e1.equals(e2)) {
			System.out.println("Equal ");
		} else {
			System.out.println("Not Equal ");
		}
	}

}

class Employee {
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*@Override
	public boolean equals(Object obj) {
		return obj instanceof Employee;
	}*/

}