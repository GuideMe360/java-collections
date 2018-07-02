package com.guideme.core;

public class VolatieExample implements Runnable {
	private volatile boolean active;

	@Override
	public void run() {
		active = true;
		while (active) {
			System.out.println("Hi");
		}
	}

	private void stop() {
		System.out.println("Stop");
		active = false;

	}

	public static void main(String[] args) {
		VolatieExample vol = new VolatieExample();
		Thread obj = new Thread(vol);
		obj.start();
		vol.stop();
	}

}
