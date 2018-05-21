package com.guideme.interview.thread;

class Count extends Thread {
	Count() {
		super("My Extending Thread");
		start();
	}

	public void run() {
		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Print Count :" + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main thread run is over");
	}
}

public class ExtendingExample {

	public static void main(String[] args) {
		Count cnt = new Count();
		try {
			while(cnt.isAlive()) {
				System.out.println("Main thread will be alive till the child thread is alive");
				Thread.sleep(1500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
