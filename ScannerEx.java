package com.ot9.basics;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your empid:");
		int empId = scan.nextInt();
		System.out.println("Enter Your empName:");
		String empName = scan.next();
		System.out.println("Enter Your empSalary:");
		float empSal = scan.nextFloat();
		System.out.println("Enter Your empadd:");
		String empAdd = scan.next();
		
		System.out.println(empId+" "+empName+" "+empSal+" "+empAdd);
	}

}
