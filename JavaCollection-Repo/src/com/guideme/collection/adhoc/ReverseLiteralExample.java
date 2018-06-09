package com.guideme.collection.adhoc;

public class ReverseLiteralExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lit = "ARUN";
		char ch[] = lit.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int j=ch.length-1;j>=0;j--){
			sb.append(ch[j]);
		}
		System.out.println("Reverse Without Expression:"+sb.toString());
		
		StringBuilder sb1 = new StringBuilder().append(lit);
		System.out.println("Reverse Method Output :"+sb1.reverse());
	}
}
