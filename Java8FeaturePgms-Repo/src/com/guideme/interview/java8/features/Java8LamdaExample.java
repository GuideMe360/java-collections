/**
 * Author :Arun Ammasai
 * JAVA/J2EE Programmer
 * 25-May-2018
 */
package com.guideme.interview.java8.features;

/**
 * @author Arun
 *
 */
public class Java8LamdaExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MathOperation addition = (int z, int b) -> z + b;
		MathOperation substraction = (int a, int b) -> a - b;

		System.out.println("10 + 5 :" + addition.operation(10, 5));
		System.out.println("10 - 5 :" + substraction.operation(10, 5));

		Greetingervice greeting = (message) -> message * 10;
		System.out.println(">>>>>> :" + greeting.sayMessage(10));

		//TestInterface ti = (message) -> System.out.println("Hello :" + message);
	}

}

interface MathOperation {
	int operation(int a, int b);
}

interface Greetingervice {
	int sayMessage(int message);
}

interface TestInterface {
	int msgMe(String message);
}