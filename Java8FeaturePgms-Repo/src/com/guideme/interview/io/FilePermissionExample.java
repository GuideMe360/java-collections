package com.guideme.interview.io;
import java.io.FilePermission;
import java.security.PermissionCollection;

/**
 * Author :Arun Ammasai
 * JAVA/J2EE Programmer
 * 25-May-2018
 */

/**
 * @author Arun
 *
 */
public class FilePermissionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String file = "c:\\dummy\\test.txt";
		FilePermission file1 = new FilePermission("c:\\dummy\\-", "read");
		PermissionCollection pc = file1.newPermissionCollection();
		pc.add(file1);

		FilePermission file2 = new FilePermission(file, "write");
		//pc.add(file2);

		if (pc.implies(new FilePermission(file, "read,write"))) {
			System.out.println("Read, Write permission is granted for the path " + file);
		} else {
			System.out.println("No Read, Write permission is granted for the path " + file);
		}
	}

}
