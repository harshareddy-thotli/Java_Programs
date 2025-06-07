package com;

public class ThreadsPractice extends Thread {
	
	Thread threadspractice;
	Counter counter;

	public ThreadsPractice() {
		
	}
	

	public ThreadsPractice(Counter counter) {
		this.counter = counter;
	}



	@Override
	public void run() {
		
		for(int i = 0; i<5; i++) {
			//System.out.println("ThreadsPractice");
			try {
				System.out.println("Threadspractice");
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
