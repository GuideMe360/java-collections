/**
 * Author :Arun Ammasai
 * JAVA/J2EE Programmer
 * 24-May-2018
 */
package com.guideme.interview.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Arun
 *
 */
public class DataOutputStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("c:\\dummy\\test.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			try {
				dos.write(66);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Success...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
