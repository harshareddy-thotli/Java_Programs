package com;

public class T1 extends Thread{
	T2 t2;
	
	@Override
	public void run() {
		try {
			
			t2.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
	}
	
	
}
