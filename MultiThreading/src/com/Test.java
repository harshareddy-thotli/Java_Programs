package com;


public class Test {
	
	public static void main(String[] args) {
		
		
		String name = Thread.currentThread().getName();
		System.out.println(name);
		MyThread1 mythread1 = new MyThread1();
		MyThread2 mythread2 = new MyThread2();
		Runnable mythread3 = new MyThread3(); //parent reference type holding the child class object 
		
		Thread t3 = new Thread(mythread3);
		
		mythread1.start(); //our thread will register in the thread scheduler
		mythread2.start();
		t3.start();
		sayHi();
//		sayBye();
		
	}
	
	static void sayHi() {
		
		for(int i =1 ; i<=5; i++) {
			System.out.println("Hii..");
		}
		
	}
	static void sayBye() {
		
		for(int i =1 ; i<=5; i++) {
			System.out.println("Byee..");
		}
		
	}
	
}
