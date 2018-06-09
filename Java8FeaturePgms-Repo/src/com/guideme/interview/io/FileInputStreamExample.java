/**
 * Author :Arun Ammasai
 * JAVA/J2EE Programmer
 * 23-May-2018
 */
package com.guideme.interview.io;

import java.io.FileInputStream;

/**
 * @author Arun
 *
 */
public class FileInputStreamExample {

	/**
	 * @param args
	 */
	public static void main1(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("c:\\dummy\\test.txt");
			int i = fis.read();
			System.out.println("Data :" + (char) i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("c:\\dummy\\test.txt");
			int i = 0;
			StringBuilder sb = new StringBuilder();
			while ((i = fis.read()) != -1) {
				sb.append((char)i);
			}
			System.out.println("File Content :"+sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
