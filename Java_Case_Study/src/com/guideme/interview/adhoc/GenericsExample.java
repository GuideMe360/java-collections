/**
 * Author :Arun Ammasai
 * JAVA/J2EE Programmer
 * 25-May-2018
 */
package com.guideme.interview.adhoc;

/**
 * @author Arun
 *
 */
public class GenericsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Container<Number> con = new Container();
		con.value = 5.5;
		con.show();
	}

}

class Container<T extends Number>{
	T value;
	public void show() {
		System.out.println("Type :"+value.getClass().getName());
	}
}
