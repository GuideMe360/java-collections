/**
 * Author :Arun Ammasai
 * JAVA/J2EE Programmer
 * 23-May-2018
 */
package com.guideme.interview.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 * @author Arun
 *
 */
public class SequenceInputStreamExample {

	/**
	 * @param args
	 */
	public static void main1(String[] args) throws Exception {
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		SequenceInputStream sis = null;
		try {
			fis1 = new FileInputStream("c:\\dummy\\test.txt");
			fis2 = new FileInputStream("c:\\dummy\\test1.txt");
			sis = new SequenceInputStream(fis1, fis2);
			int i = 0;
			StringBuilder sb = new StringBuilder();
			while ((i = sis.read()) != -1) {
				// System.out.println("Content :"+(char)i);
				sb.append((char) i);
			}
			System.out.println("Final Content : " + sb);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sis.close();
			fis1.close();
			fis2.close();
		}
	}

	public static void main(String[] args) throws IOException {

		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		SequenceInputStream sis = null;
		FileOutputStream fos = null;
		try {
			fis1 = new FileInputStream("c:\\dummy\\test.txt");
			fis2 = new FileInputStream("c:\\dummy\\test1.txt");
			fos = new FileOutputStream("c:\\\\dummy\\\\output.txt",true);
			sis = new SequenceInputStream(fis1, fis2);
			int i = 0;
			StringBuilder sb = new StringBuilder();
			while ((i = sis.read()) != -1) {
				fos.write(i);
				sb.append((char) i);
			}
			System.out.println("Content Updated Successfully...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sis.close();
			fis1.close();
			fis2.close();
		}

	}
}
