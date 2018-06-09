package com.guideme.thread;

class JoinThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(1500);
				System.out.println("Current Thread is :" + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				System.out.println("Exception Caught :" + e);
			}
			System.out.println("i value :" + i);
		}
	}
}

public class ThreadJoinExample {

	public static void main(String[] args) {
		JoinThread t1 = new JoinThread();
		JoinThread t2 = new JoinThread();
		JoinThread t3 = new JoinThread();

		t1.start();
		try {
			System.out.println("Current Thread: " + Thread.currentThread().getName());
			t1.join();
		} catch (Exception ex) {
			System.out.println("Exception has " + "been caught" + ex);
		}

		t2.start();
		try {
			System.out.println("Current Thread: " + Thread.currentThread().getName());
			t1.join();
		} catch (Exception ex) {
			System.out.println("Exception has " + "been caught" + ex);
		}
		t3.start();
	}

}
