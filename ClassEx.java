package com.ot9.java8;

interface A {
	public void m1();

	public default void m2() {

	}

	public static void m3() {

	}
}

public class ClassEx implements A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

}
