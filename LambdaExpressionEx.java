package com.virtual.java8;

@FunctionalInterface
interface Calculator {
	 void add(int a, int b);//public abstract void add(int a,int b);
	 public default void m1()
	 {
		 
	 }
	 public  static void m2()
	 {
		 
	 }
}

public class LambdaExpressionEx {

	public static void main(String[] args) {
		Calculator calci = (a, b) -> System.out.println(a + b);
		calci.add(12, 13);
	}

}
