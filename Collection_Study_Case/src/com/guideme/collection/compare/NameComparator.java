package com.guideme.collection.compare;

import java.util.Comparator;

import com.guideme.collection.list.dto.Book;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Book b1 = (Book) obj1;
		Book b2 = (Book) obj2;
		return b1.getName().compareTo(b2.getName());
	}

}
