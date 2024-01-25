package com.ot9.oops;

interface Parent1 {
	public abstract void m1();

}

interface Parent2 {
	public abstract void m1();

	public abstract void m2();
}

public class MultipleInheritancce implements Parent1, Parent2 {

	public static void main(String[] args) {
		MultipleInheritancce obj=new MultipleInheritancce();
			obj.m1();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

}
