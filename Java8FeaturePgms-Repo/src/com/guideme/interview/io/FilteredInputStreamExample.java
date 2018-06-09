/**
 * Author :Arun Ammasai
 * JAVA/J2EE Programmer
 * 24-May-2018
 */
package com.guideme.interview.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/**
 * @author Arun
 *
 */
public class FilteredInputStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("c:\\dummy\\test.txt");
		FileInputStream fis = new FileInputStream(file);
		FilterInputStream filter = new BufferedInputStream(fis);
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while ((i = filter.read()) != -1) {
			sb.append(((char)i)+"");
		}
		System.out.println(sb.toString());
	}

}
