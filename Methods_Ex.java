package com.ot9.basics;
public class Methods_Ex {
	int marks = 222;// global and instance
	static int countryCode = 91;// global and static
	public void add(int a, int b) {
		int result = a + b;
		System.out.println("add of two numbers : " + result + " " + marks);
	}
	public int sub(int a, int b) {
		int result = a - b;
		return result;
	}
	public int mul() {
		int result = 10 * 20;
		return result;
	}
	public static void displayMessage() {
		System.out.println("welcome to java ");
	}
	public static void main(String[] args) {
		Methods_Ex.displayMessage(); // static variable access by using class name
		Methods_Ex obj = new Methods_Ex(); // to provide memory space instance properties
		System.out.println(obj.marks);// instance variables access by using obj reference
		obj.add(12, 13); // instance method calling by using obj reference
		System.out.println(obj.sub(12, 2));
		System.out.println(obj.mul());
	}
}
