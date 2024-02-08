package com.ot9.threads;

public class ThreadEx1 implements Runnable {

	@Override
	public void run() {//running
		System.out.println(Thread.currentThread());
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");//5,thread-0
		}
	}//thread scheduler  -->dead 

	public static void main(String[] args) {//main thread
		System.out.println(Thread.currentThread());
		ThreadEx1 obj = new ThreadEx1();
		Thread thread = new Thread(obj);//new
		thread.start();//run() --->runnable
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");//5 ,main
		}
		Thread thread1 = new Thread(obj);
		thread1.start();//run()
	}

}
