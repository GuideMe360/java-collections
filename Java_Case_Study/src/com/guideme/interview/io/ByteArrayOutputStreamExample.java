/**
 * Author :Arun Ammasai
 * JAVA/J2EE Programmer
 * 23-May-2018
 */
package com.guideme.interview.io;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Arun
 *
 */
public class ByteArrayOutputStreamExample {
	public static void main2(String[] args) throws IOException{

		FileOutputStream fis1 = null;
		FileOutputStream fis2 = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			fis1 = new FileOutputStream("c:\\dummy\\test.txt");
			fis2 = new FileOutputStream("c:\\dummy\\test1.txt");
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			baos.write(65);
			baos.writeTo(fis1);
			baos.writeTo(fis2);
			baos.flush();
			baos.close();
			System.out.println("Content Updated Successfully...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fis1.close();
			fis2.close();
		}

	}

	public static void main(String[] args) throws IOException {

		FileOutputStream fis1 = null;
		FileOutputStream fis2 = null;
		try {
			fis1 = new FileOutputStream("c:\\dummy\\test.txt",true);
			fis2 = new FileOutputStream("c:\\dummy\\test1.txt",true);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			String contentToWrite = "\nWelcome to Guideme 360";
			baos.write(contentToWrite.getBytes());
			baos.writeTo(fis1);
			baos.writeTo(fis2);
			baos.flush();
			baos.close();
			System.out.println("Content Updated Successfully...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fis1.close();
			fis2.close();
		}

	}
	
	public static void main5(String[] args) throws IOException {
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
