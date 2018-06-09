package com.guideme.collection.adhoc;

interface A {
	void msg();
	default void msg1() {
		System.out.println("Messgae 1");
	}
}

class B implements A {
	public void msg() {
		System.out.println("Message Method");
	}
}

public class InherExample extends B {

	public static void main(String[] args) {
		InherExample ix = new InherExample();
		ix.msg1();
	}
	

}
