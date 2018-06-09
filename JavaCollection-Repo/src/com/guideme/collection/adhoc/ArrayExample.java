package com.guideme.collection.adhoc;

public class ArrayExample {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 }, { 7, 8, 9 } };

		System.out.println(">>> Array Length :" + arr.length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
