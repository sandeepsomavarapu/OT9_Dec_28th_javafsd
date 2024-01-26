package com.ot9.oops;

public class ConstructorEx {

	public ConstructorEx() {
		System.out.println("default constructor");
	}

	public ConstructorEx(String name) {
		System.out.println("param constructor" + name);
	}

	public void m1() {
		System.out.println("am from m1 method");
	}

	public static void main(String[] args) {
		ConstructorEx obj = new ConstructorEx("sandeep");// jvm will create and call
		obj.m1();
	}

}
