package com.guideme.interview.thread;

class ThreadOne extends Thread {

	private Object obj1;
	private Object obj2;

	public ThreadOne(Object obj1, Object obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + "Thread acquring lock on :" + obj1);
		synchronized (obj1) {
			System.out.println(name + "Thread acquring lock on :" + obj1);
			work();
			System.out.println(name + "Thread acquring lock on :" + obj2);
			synchronized (obj2) {
				System.out.println(name + "Thread acquring lock on :" + obj2);
				work();
			}
			System.out.println(name + " released lock on " + obj2);
		}
		System.out.println(name + " released lock on " + obj1);
		System.out.println("Execution Finished ...");
	}

	private void work() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class DeadlockExample {
	public static void main(String[] args) throws InterruptedException {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();

		ThreadOne t1 = new ThreadOne(obj1, obj2);
		ThreadOne t2 = new ThreadOne(obj2, obj3);
		ThreadOne t3 = new ThreadOne(obj3, obj1);
		t1.start();
		Thread.sleep(5000);
		t2.start();
		Thread.sleep(5000);
		t3.start();
	}
}
