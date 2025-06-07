package com;

public class ThreadsPracticeMain {

	public static void main(String[] args) throws InterruptedException {
		
		Counter SharedCounter = new Counter();
		
		ThreadsPractice tp = new ThreadsPractice(SharedCounter);
		ThreadsPractice1 tp1 = new ThreadsPractice1(SharedCounter);
		Thread t = new Thread(tp1);
		
		tp.threadspractice = t;
		tp1.threadspractice = tp;
		
		
		
		
		
		tp.start();
		
		t.start();
		
		//tp.join(); //join() stops the execution of current thread until the thread which we called using join method is executed completely		
		t.join();
		
		System.out.println(SharedCounter.count);
		
		
	}
	
}
