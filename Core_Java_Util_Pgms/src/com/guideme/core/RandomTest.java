package com.guideme.core;

public class RandomTest {
	public static void main(String[] args) {
		try {
			Runtime.getRuntime().exit(0);
		} catch (Exception e) {
			System.out.println("Exception Captured");
			e.printStackTrace();
		}finally {
			System.out.println("Finally Captured");
		}
	}
}
