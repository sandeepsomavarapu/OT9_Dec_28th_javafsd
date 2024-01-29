package com.ot9.oops;

class Parent_Ex {
	public Parent_Ex() {
		this("suresh");
		System.out.println("default constructor of parent_Ex");
	}

	public Parent_Ex(String name) {
		System.out.println("param constructor of parent_Ex" + name);
	}

	int marks = 333;

	public void m1() {
		System.out.println("Am from m1 method of ParentEx class");
	}
}

public class ThisSuperEx extends Parent_Ex {
	int marks = 222;

	public ThisSuperEx() {
		super();
		System.out.println("default constructor...");
	}

	public ThisSuperEx(int marks) {

		this();
		System.out.println(this);
		System.out.println("param constructor..." + marks + " " + this.marks + " " + super.marks);
		this.m1();
		super.m1();
	}

	@Override
	public void m1() {
		System.out.println("Am from m1 method of ThisSuperEx class");
	}

	public static void main(String[] args) {
		ThisSuperEx obj = new ThisSuperEx(111);
		System.out.println(obj);// object address toString()->object
		System.out.println(obj.toString());
	}

}
