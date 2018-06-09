package com.guideme.collection.compare;

import java.util.Comparator;

import com.guideme.collection.list.dto.Book;

public class IdComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Book b1 = (Book) obj1;
		Book b2 = (Book) obj2;
		if (b1.getId() == b2.getId()) {
			return 0;
		} else if (b1.getId() > b2.getId()) {
			return 1;
		} else {
			return -1;
		}
	}

}
