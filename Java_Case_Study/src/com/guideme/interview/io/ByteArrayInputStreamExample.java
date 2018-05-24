/**
 * Author :Arun Ammasai
 * JAVA/J2EE Programmer
 * 24-May-2018
 */
package com.guideme.interview.io;

import java.io.ByteArrayInputStream;

/**
 * @author Arun
 *
 */
public class ByteArrayInputStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte[] ba = {35,45,75,55};
		ByteArrayInputStream bais = new ByteArrayInputStream(ba);
		int i =0;
		while((i=bais.read())!=-1) {
			System.out.println("Byte :"+i+" and Value :"+(char)i);
		}
		
	}

}
