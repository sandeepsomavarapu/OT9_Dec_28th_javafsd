package com.ot9.threads;

public class ThreadEx2 extends Thread {

	@Override
	public void run() {
		System.out.println(ThreadEx2.currentThread());
		Thread.currentThread().setPriority(10);
		Thread.currentThread().setName("india");
		System.out.println(ThreadEx2.currentThread());
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("child Thread");//5
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println(ThreadEx2.currentThread());//thread name,priority
		
		ThreadEx2 obj = new ThreadEx2();
		obj.setPriority(1);
		System.out.println(obj.getName()+" "+obj.getPriority());
		obj.start();
		obj.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");//5   1-10 thread scheduler 
		}
	}

}
