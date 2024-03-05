package com.ot9.java8;

@FunctionalInterface
interface FI {
	public abstract int addOfTwo(int a, int b);

	public default void m1() {

	}

	public static void m2() {

	}
}

public class LambdaEx {
	public static void main(String[] args) {
		FI ref = (a, b) -> a + b;
		System.out.println(ref.addOfTwo(12, 16));
		FI ref1 = (a, b) -> a - b;
		System.out.println(ref1.addOfTwo(12, 16));
	}

}
