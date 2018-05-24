/**
 * Author :Arun Ammasai
 * JAVA/J2EE Programmer
 * 24-May-2018
 */
package com.guideme.interview.io;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Arun
 *
 */
public class JavaConsoleExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String name = br.readLine();
			System.out.println(">>>>>> :"+name);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
