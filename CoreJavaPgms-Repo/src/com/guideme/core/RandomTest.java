package com.guideme.core;

public class RandomTest implements A, B {
	public static void main1(String[] args) {
		try {
			System.out.println("Started");
			Runtime.getRuntime().exit(0);
			System.out.println("Ended");
		} catch (Exception e) {
			System.out.println("Exception Captured");
			e.printStackTrace();
		} finally {
			System.out.println("Finally Captured");
		}
	}

	public static void main(String[] args) {
		System.out.println(">>> :");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

}

interface A {
	int a = 5;

	void add();
}

interface B {
	int a = 10;

	void add();
}
