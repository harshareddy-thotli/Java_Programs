package com;

public class Counter {

		int count = 0;
		
		public synchronized void increment() {
			
			//synchronized (this) { count++; } we can make blocks also as synchronized
				count++;
			
		}
}
