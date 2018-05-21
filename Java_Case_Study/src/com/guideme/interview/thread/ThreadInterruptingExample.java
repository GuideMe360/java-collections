package com.guideme.interview.thread;

public class ThreadInterruptingExample extends Thread {

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted :" + e);
		}
		System.out.println("thread is running...");
	}

	public static void main(String[] args) {
		ThreadInterruptingExample t1 = new ThreadInterruptingExample();
		t1.start();
		t1.interrupt();
		/*
		 * try { t1.interrupt(); } catch (Exception e) {
		 * System.out.println("Exception handled :" + e); }
		 */
	}

}
