/**
 * Author :Arun Ammasai
 * JAVA/J2EE Programmer
 * 24-May-2018
 */
package com.guideme.interview.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Arun
 *
 */
public class DataInputStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("c:\\dummy\\test.txt");
			DataInputStream dis = new DataInputStream(is);
			int count;
			StringBuilder sb = new StringBuilder();
			try {
				count = is.available();
				System.out.println("Is Avaialble :"+count);
				byte[] ary = new byte[count];
				dis.read(ary);
				for(byte b : ary) {				
					char ch = (char)b;
					sb.append(ch+"");
				}
				System.out.println(sb.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
