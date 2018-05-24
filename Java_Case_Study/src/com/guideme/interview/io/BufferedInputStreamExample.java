/**
 * Author :Arun Ammasai
 * JAVA/J2EE Programmer
 * 23-May-2018
 */
package com.guideme.interview.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * @author Arun
 *
 */
public class BufferedInputStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("c:\\dummy\\test.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			int i = 0;
			StringBuilder sb = new StringBuilder();
			while ((i = bis.read()) != -1) {
				System.out.println((char)i);
				sb.append((char) i);
			}
			System.out.println("File Content :" + sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
