package com;

public class ThreadsPractice1 implements Runnable {
	
	ThreadsPractice threadspractice;
	Counter counter;
	
	public ThreadsPractice1() {
		
	}
	
	public ThreadsPractice1(Counter counter) {
		this.counter = counter;
	}



	@Override
	public void run() {
		
		for(int i = 0; i<5; i++) {
			
			//System.out.println("ThreadsPractice1");
			try {
				System.out.println("ThreadsPractice1");
				threadspractice.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter.increment();
			System.out.println(counter.count);
			
		}
		
	}

}
