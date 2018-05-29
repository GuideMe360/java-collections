/**
 * Author :Arun Ammasai
 * JAVA/J2EE Programmer
 * 29-May-2018
 */
package com.guideme.interview.adhoc;

import java.util.Collections;
import java.util.List;

/**
 * @author Arun
 *
 */
public class NumerOfCopies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = Collections.nCopies(10, "Hello");
		list.forEach(p -> System.out.println("Data :"+p));
	}

}
