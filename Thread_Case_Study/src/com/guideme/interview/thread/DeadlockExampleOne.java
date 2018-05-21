package com.guideme.interview.thread;

public class DeadlockExampleOne {
	public static void main(String[] args) {
		final String str1 = "JAVA";
		final String str2 = "J2EE";
		new Thread() {
			@Override
			public void run() {
				synchronized (str1) {
					System.out.println("Thread 1 String 1 Lock");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					synchronized (str2) {
						System.out.println("Thred 1 String 2 Lock");
					}
				}
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				synchronized (str2) {
					System.out.println("Thread 2 String 2 Lock");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					synchronized (str1) {
						System.out.println("Thred 2 String 1 Lock");
					}
				}
			}
		}.start();
	}
}
