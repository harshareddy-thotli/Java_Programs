package com;

public class MyThread3 implements Runnable {
	
	//Runnable interface doesn't have run method implementation
	@Override
	public void run() {
		for(int i=1; i<=10;i++) {
			System.out.println("Mythread3");
		}
		
	}

}
