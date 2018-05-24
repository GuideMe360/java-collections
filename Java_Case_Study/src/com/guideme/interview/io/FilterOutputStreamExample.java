/**
 * Author :Arun Ammasai
 * JAVA/J2EE Programmer
 * 24-May-2018
 */
package com.guideme.interview.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Arun
 *
 */
public class FilterOutputStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("c:\\dummy\\test.txt");
		try {
			OutputStream os = new FileOutputStream(file);
			FilterOutputStream fos = new FilterOutputStream(os);
			String content = "Welcome to GuideMe360";
			byte[] b = content.getBytes();
			try {
				fos.write(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("File Updated");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
