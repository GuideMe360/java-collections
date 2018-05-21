package com.guideme.interview.thread;

public class SynchronizedThreadExample {

	public static void main(String[] args) {
		Sender send = new Sender();
		ThreadSender ts1 = new ThreadSender("Hi", send);
		ThreadSender ts2 = new ThreadSender("Bye", send);
		ts1.start();
		ts2.start();
	}

}

class Sender {
	public void send(String s) {
		System.out.println("Body Content :" + s);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n" + s + " - Message Send");
	}
}

class ThreadSender extends Thread {
	private String msg;
	private Thread t;
	Sender sender;

	ThreadSender(String m, Sender s) {
		msg = m;
		sender = s;
	}

	public void run() {
		synchronized (sender) {
			sender.send(msg);
		}
	}
}
