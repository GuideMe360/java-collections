package com.guideme.collection.adhoc;

public class ThreadExample implements Runnable {
	public void run() {
		for (int i = 0; i <= 3; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Value :" + i);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		ThreadExample tx = new ThreadExample();
		Thread t = new Thread(tx);
		Thread t1 = new Thread(tx);
		t.start();		
		t1.start();
		System.out.println("I'm Sleeping");
	}
}
