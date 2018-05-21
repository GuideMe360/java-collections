package com.guideme.interview.thread;

class Counter {
	synchronized void printCounter(int n) {
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

class ThreadOne extends Thread {
	Counter count;

	public ThreadOne(Counter count2) {
		this.count = count2;
	}

	@Override
	public void run() {
		count.printCounter(5);
	}
}

class ThreadTwo extends Thread {
	Counter count;

	public ThreadTwo(Counter count) {
		this.count = count;
	}

	@Override
	public void run() {
		count.printCounter(10);
	}
}

public class SynchronizationExample  {

	public static void main(String[] args) {
		System.out.println("AAAAA");
		try {
			Counter count = new Counter();
			ThreadOne t1 = new ThreadOne(count);
			ThreadTwo t2 = new ThreadTwo(count);
			t1.start();
			t2.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
