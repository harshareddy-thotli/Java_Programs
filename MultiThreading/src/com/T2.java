package com;

public class T2 extends Thread{
	T1 t1;
	
	@Override
	public void run() {
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
