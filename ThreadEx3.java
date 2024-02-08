package com.ot9.threads;

public class ThreadEx3 extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
		Thread.currentThread().setName("ot9");
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread());
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("child  thread");
		}
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
		Thread.currentThread().setName("hello");
		Thread.currentThread().setPriority(1);
		System.out.println(Thread.currentThread());
		ThreadEx3 obj = new ThreadEx3();
		obj.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main  thread");
		}
	}
}
