package com.ot9.oops;

import java.util.Date;

interface SuperParentEx {
	int a = 123;// public static final int a =123;

	void sub(int a, int b);// public abstract void sub()

	public abstract void mul(int a, int b);// public abstract void sub()

}

abstract class Parent implements SuperParentEx {
	int age = 30;

	public void displayAge() {
		++age;
		System.out.println("Age is :" + age);
	}

	public abstract void add();
}

public class AbstractionEx extends Parent {

	public void displayDate() {
		System.out.println("Today's Date :" + new Date());
	}

	public void displayMsg() {
		System.out.println("welcome to java");
	}

	public static void main(String[] args) {
		AbstractionEx obj = new AbstractionEx();
		obj.displayDate();
		obj.displayMsg();
		obj.displayAge();
		System.out.println(obj.age);
	}

	@Override
	public void sub(int a, int b) {
		System.out.println(a - b);

	}

	@Override
	public void mul(int a, int b) {
		System.out.println(a * b);
	}

	@Override
	public void add() {
		System.out.println(a + a);
	}

}
