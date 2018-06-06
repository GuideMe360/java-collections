package com.guideme.core;

public class DecimalToBinary {

	public static void main(String[] args) {
		DecimalToBinary.binarySearch(25);
	}

	public static void binarySearch(int number) {
		int binary[] = new int[25];
		int index = 0;
		while (number > 0) {
			binary[index++] = number % 2;
			number = number / 2;
		}
		
		for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
	}

}
