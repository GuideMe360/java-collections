package com.guideme.core;

public class GarbageCollectorExample {

	public static void main(String[] args) {
		GarbageCollectorExample t1 = new GarbageCollectorExample();
		GarbageCollectorExample t2 = new GarbageCollectorExample();
		
		t1 = null;
		System.gc();
		t2 =null;
		
		Runtime.getRuntime().gc();
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("GC Collected :"+this);
	}

}
