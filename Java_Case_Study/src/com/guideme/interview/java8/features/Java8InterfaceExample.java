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
public class Java8InterfaceExample implements Interface1, Interface2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Java8InterfaceExample inter = new Java8InterfaceExample();
		inter.log("Hello");	
		System.out.println("Class Name:"+inter.getClass().getName());
		inter.method1();
		inter.method2();
	}
	
	@Override
	public void log(String str) {
		System.out.println("MyClass logging::"+str +"/ Class Name:"+str.getClass().getName());
		Interface1.print("abc");
	}

	@Override
	public void method2() {
		System.out.println("Method 2 Called");
	}

	@Override
	public void method1() {
		System.out.println("Method 1 Called");

	}

}

@FunctionalInterface
interface Interface1 {
	void method1();

	default void log(String str) {
		System.out.println("I1 logging::" + str);
	}

	static void print(String str) {
		System.out.println("Printing " + str);
	}
}

@FunctionalInterface
interface Interface2 {
	void method2();

	default void log(String str) {
		System.out.println("I2 logging::" + str);
	}
}