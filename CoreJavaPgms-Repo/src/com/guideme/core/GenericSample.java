package com.guideme.core;

import java.util.ArrayList;
import java.util.List;

class GenericSample1 {

	public static void main1(String[] args) {
		MyGen<String> m = new MyGen<>();
		m.add("Arun");
		System.out.println(m.get());
	}

	public static void main(String[] args) {
		Integer[] intArray = { 10, 20, 30, 40, 50 };
		Character[] charArray = { 'J', 'A', 'V', 'A', 'T', 'P', 'O', 'I', 'N', 'T' };
		printArray(intArray);
		printArray(charArray);
	}

	public static <E> void printArray(E[] elements) {
		for (E element : elements) {
			System.out.println("Element :" + element);
		}
	}

}

class MyGen<T> {
	T obj;

	void add(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("Draw Rectangle");
	}
}

class Square extends Shape {
	@Override
	void draw() {
		System.out.println("Draw Square");
	}
}

public class GenericSample {
	public static void drawShape(List<? extends Shape> list) {
		for (Shape s : list) {
			s.draw();
		}
	}

	public static void main(String[] args) {
		List<Rectangle> rectangleList = new ArrayList<Rectangle>();
		rectangleList.add(new Rectangle());

		List<Square> squareList = new ArrayList<Square>();
		squareList.add(new Square());
		squareList.add(new Square());
		drawShape(rectangleList);
	}
}