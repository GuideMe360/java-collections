package com.guideme.interview.thread;

class Counter {
	void printData(int n) {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + " -Multiply With * " + n + " - Answer is :" + (i * n));
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Thread1 extends Thread {
	Counter count;

	public Thread1(Counter count) {
		this.count = count;
	}

	@Override
	public void run() {
		count.printData(5);
	}
}

class Thread2 extends Thread {
	Counter count;

	public Thread2(Counter count) {
		this.count = count;
	}

	@Override
	public void run() {
		count.printData(10);
	}
}

public class SynchronizationBlockExample {

	public static void main(String[] args) {
		Counter count = new Counter();
		Thread1 t1 = new Thread1(count);
		Thread2 t2 = new Thread2(count);
		t1.start();
		t2.start();
	}

}
