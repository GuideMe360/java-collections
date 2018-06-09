package com.guideme.collection.adhoc;

class InvalidAgeException extends Exception {
	InvalidAgeException(String s) {
		super(s);
	}
}

public class TestMultipleCatchBlock {

	public static void main(String[] args) throws InvalidAgeException {
		validate(35);
		test();
	}

	private static void test() {
		System.out.println("Remaining Code...");

	}

	static void validate(int age) throws InvalidAgeException {
		if (age > 25) {
			throw new InvalidAgeException("Invalida Age");
		} else {
			System.out.println("Eligible Candidate");
		}
	}

}
