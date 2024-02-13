package com.ot9.streamio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestEmployee {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Serialization
//		Employee emp = new Employee(123, "suresh", 12300, "developer");
//		FileOutputStream fos = new FileOutputStream("emps.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(emp);
//		System.out.println("Employee Saved Successfully");
		// De-Serialization

		FileInputStream fos = new FileInputStream("emps.txt");
		ObjectInputStream oos = new ObjectInputStream(fos);
		Employee emp = (Employee) oos.readObject();
		System.out.println(emp);//toString
		System.out.println(emp.toString());
		System.out.println(emp.hashCode());
		
	}

}
