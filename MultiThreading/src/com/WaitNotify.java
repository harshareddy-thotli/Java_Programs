package com;

public class WaitNotify {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getPriority()); //to get the thread priority
		Thread5 t5 = new Thread5(); //New
		t5.start(); //Runnable
		synchronized(t5){
			t5.wait();  //Blocked - if we want to use wait(), first we need to acquire the lock for the resource
			System.out.println(t5.count);

		}
		
	}

}

class Thread5 extends Thread{
	
	int count =0;
	@Override
	public void run() { //Running
		
		Thread.currentThread().setPriority(10);  //to set the thread priority(no use of setting priority-sometimes thread scheduler will follow the priority)
		System.out.println(Thread.currentThread().getPriority());
		synchronized(this) {
			for(int i =1; i<=100; i++) {
				count++;
			}
			this.notify(); //if want to use notify(), first we need to acquire the lock for the resource from where we are calling the notify()
		}
		
	}
	
}
