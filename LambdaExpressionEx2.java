package com.virtual.java8;
@FunctionalInterface
interface Demo {
	void add(int a, int b);// public abstract void add(int a,int b);

	public default void m1() {
		System.out.println("am from m1 method");
	}
	public default void m3() {
		System.out.println("am from m3 method");
	}
	public static void m2() {
		System.out.println("am from m2 method");
	}
}

public class LambdaExpressionEx2 implements Demo {
	public static void main(String[] args) {
		LambdaExpressionEx2 obj = new LambdaExpressionEx2();
		obj.m1();
		obj.add(12, 13);
		Demo.m2();
	}

	@Override
	public void add(int a, int b) {
		System.out.println(a + b);

	}
}
