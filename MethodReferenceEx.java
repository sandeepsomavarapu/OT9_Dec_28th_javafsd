package com.ot9.java8;

@FunctionalInterface
interface Calculator1 {
	public abstract void caluculate(int a, int b);
}

public class MethodReferenceEx {
	public MethodReferenceEx() {

	}

	public MethodReferenceEx(int a, int b) {
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		MethodReferenceEx obj = new MethodReferenceEx();
		Calculator1 calci = obj::m1;
		calci.caluculate(12, 13);

		Calculator1 calci1 = MethodReferenceEx::m2;
		calci1.caluculate(12, 9);
		
		Calculator1 calci2 = MethodReferenceEx::new;
		calci2.caluculate(12, 9);	
	}

	public void m1(int a, int b) {
		System.out.println("add of two numbers: " + (a + b));
	}

	public static void m2(int a, int b) {
		System.out.println("sub of two numbers: " + (a - b));
	}
}
