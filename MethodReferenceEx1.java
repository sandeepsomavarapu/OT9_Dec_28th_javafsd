package com.ot9.java8;

interface FI1 {
	public abstract void printMsg(String msg);

}

public class MethodReferenceEx1 {

	public static void main(String[] args) {
		FI1 fi=System.out::println;
		
		fi.printMsg("welcome to method reference");
	}

}
