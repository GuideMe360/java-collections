package com.guideme.collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.guideme.collection.list.dto.Book;

public class ComparableExample {
	
	public static void main(String a[]) {
		List<Book> list = new ArrayList();
		Book b1 = new Book(5, "DFirst Book", "Arun", "JAARAS", 10);
		Book b2 = new Book(13, "CSecond Book", "Ananth", "JAARAS", 45);
		Book b3 = new Book(3, "AThird Book", "Jenitha", "JAARAS", 13);
		list.add(b1);list.add(b2);list.add(b3);
		
		System.out.println("======================Print Book ==============================");
		iterateBook(list);
		Collections.sort(list);
		System.out.println("======================Print Book After Sort==============================");
		iterateBook(list);
	}

	private static void iterateBook(List<Book> list) {
		for(Book book : list) {
			System.out.println("ID :"+book.getId() +"/ Name :"+book.getName() +" / Author :"+book.getAuthor());
		}
	}
}
