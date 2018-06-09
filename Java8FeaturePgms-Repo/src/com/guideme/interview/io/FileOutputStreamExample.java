/**
 * Author :Arun Ammasai
 * JAVA/J2EE Programmer
 * 21-May-2018
 */
package com.guideme.interview.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Arun
 *
 */
public class FileOutputStreamExample {

	/**
	 * @param args
	 */
	public static void main1(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("c:\\dummy\\test.txt");
			fos.write(65);
			System.out.println("File Write Successful...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main2(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("c:\\dummy\\test.txt");
			String s = "Welcome to Guideme 360";
			byte b[] = s.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("File Write Successful...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			File fos = new File("c:\\dummy\\test.txt");
			if (!fos.exists()) {
				fos.createNewFile();
			}
			fw = new FileWriter(fos, true);
			bw = new BufferedWriter(fw);
			bw.write("\nAdded Additional Content to Test 01");
			System.out.println("File Updated Successfully....");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			bw.close();
			fw.close();
		}
	}

}
