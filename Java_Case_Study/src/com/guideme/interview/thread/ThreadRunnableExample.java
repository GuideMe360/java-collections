package com.guideme.interview.thread;

class RunnableThread extends Thread {
	public static int mycount = 0;

	public void run() {
		while (RunnableThread.mycount <= 10) {
			try {
				System.out.println("Thread Number :" + (++RunnableThread.mycount));
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

public class ThreadRunnableExample {
	public static void main(String[] args) {
		while (RunnableThread.mycount <= 10) {
			try {
				System.out.println("Thread Number :" + (++RunnableThread.mycount));
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("End of Main Thread...");
	}
}