package com.ot9.oops;

import java.util.Date;

class ParentEx1 {// final classes cannot be inherited
	int age = 31;// final variable value we cannot modify

	public void printAge() {// final method cannot be override
		++age;
		System.out.println("Age is :" + age); // final
	}

	public void displayMsg() {
		System.out.println("welcome to java method overriding");
	}

}

public class MethodOverridingEx extends ParentEx1 {
	@Override
	public void printAge() {
		--age;
		System.out.println("Updated Age is :" + age);
	}

	public void displayDate() {
		Date date = new Date();
		System.out.println("Today's Date : " + date);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "sandeep";
	}

	public static void main(String[] args) {
		MethodOverridingEx obj = new MethodOverridingEx();
		obj.displayDate();
		obj.printAge();
		obj.displayMsg();
		System.out.println(obj);
		System.out.println(obj.toString());// sandeep
	}

}
