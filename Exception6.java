package com.ot9.exceptions;

//our class should extends exception,Throwable
//parameterized constructor
class InvalidAgeException extends Exception {
	private int age;

	public InvalidAgeException(String message) {
		super(message);
	}
}

public class Exception6 {
	static void validation(int age) throws InvalidAgeException {
		if (age < 18)

			throw new InvalidAgeException("You are not allowed to vote");// MyException1 obj
		else
			System.out.println("you are eligable to vote");
	}

	public static void main(String args[]) {
		try {
			Exception6.validation(16);
		} catch (InvalidAgeException e) {
			System.out.println("age is invalid");
		} finally {
			System.out.println("executes always");
		}
		System.out.println("rest of the code...");
	}
}