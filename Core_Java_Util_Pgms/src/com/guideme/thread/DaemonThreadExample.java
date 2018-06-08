package com.guideme.thread;

public class DaemonThreadExample extends Thread {

	public static void main(String[] args) {
		DaemonThreadExample t1 = new DaemonThreadExample();
		DaemonThreadExample t2 = new DaemonThreadExample();
		DaemonThreadExample t3 = new DaemonThreadExample();

		t1.start();
		t1.setDaemon(true);
		t2.start();
		t3.start();
	}

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread Work");
		} else {
			System.out.println("User Thread");
		}
	}

}
