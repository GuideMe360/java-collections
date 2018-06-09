package com.guideme.collections;

import java.util.Collections;
import java.util.List;

public class SyncronizeArrayList {

	public static void main(String[] args) throws Exception {
		List<String> list = CollectionHelper.populateList();
		list = Collections.synchronizedList(list);
		CollectionHelper.printList(list);
		list.add("Test");

		synchronized (list) {
			list.forEach(p -> {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(p);
			});
		}
	}

}
