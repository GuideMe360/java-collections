package com.guideme.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientExample {

	public static void main2(String[] args) throws Exception {
		Student s1 = new Student(211, "Arun", 22);
		FileOutputStream f = new FileOutputStream("src\\com\\guideme\\core\\files\\Serialize.txt");
		ObjectOutputStream out = new ObjectOutputStream(f);
		out.writeObject(s1);
		out.flush();

		out.close();
		f.close();
		System.out.println("success 1");

		/*
		 * ObjectInputStream in = new ObjectInputStream(new
		 * FileInputStream("src\\com\\guideme\\core\\Serialize.txt")); Student s =
		 * (Student) in.readObject(); System.out.println(s.id + " " + s.name + " " +
		 * s.age); in.close(); System.out.println("success 2");
		 */
	}

	public static void main(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("src\\com\\guideme\\core\\files\\Serialize.txt"));
		Student s = (Student) in.readObject();
		System.out.println(s.id + " " + s.name + " " + s.age);
		in.close();
		System.out.println("success 2");
	}

}

class Student implements Serializable {
	int id;
	String name;
	transient int age;// Now it will not be serialized

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
