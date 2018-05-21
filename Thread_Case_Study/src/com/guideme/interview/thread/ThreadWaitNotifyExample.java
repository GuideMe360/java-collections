package com.guideme.interview.thread;

class Bank {
	int amt = 1000;

	synchronized void withDraw(int withdrawAmt) {
		System.out.println("WithDraw Initiated");
		if (this.amt < withdrawAmt) {
			System.out.println("Withdraw Failed Due to Insifficient balance");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.amt -= withdrawAmt;
			System.out.println("Withdraw Succeed");
		}
	}

	synchronized void testMethod() {
		System.out.println("Test Method");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized void depositAmt(int depositAmt) {
		System.out.println("Deposit Initiated");
		this.amt += depositAmt;
		System.out.println("Deposit Succeed");
		notify();
	}
}

public class ThreadWaitNotifyExample {

	public static void main(String[] args) {
		Bank bank = new Bank();

		new Thread() {
			@Override
			public void run() {
				bank.withDraw(1500);
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				bank.depositAmt(1500);
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				bank.testMethod();
			}
		}.start();
	}

}
