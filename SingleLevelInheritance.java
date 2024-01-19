package com.ot9.oops;

import java.util.Date;
class SuperParent
{
	public void m1() 
	{
		System.out.println("am from m1 method of SuperParent");
	}

}
class ParentEx extends SuperParent{
	public void add(int a, int b) {
		int result = a + b;
		System.out.println("add of two numbers : " + result);
	}

	public int sub(int a, int b) {
		return a - b;
	}

}

public class SingleLevelInheritance extends SuperParent {

	public void displayDate() {
		Date date = new Date();
		System.out.println("Today's Date : " + date);

	}

	public static void main(String[] args) {
		SingleLevelInheritance obj = new SingleLevelInheritance();
		obj.displayDate();
		//obj.add(123, 23);
		//System.out.println(obj.sub(23, 3));
		obj.m1();
	}

}
