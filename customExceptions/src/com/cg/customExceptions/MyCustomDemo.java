package com.cg.customExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCustomDemo {

	public void checkAge() throws InvalidAgeException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age = 0;

		try {
			age = scanner.nextInt();
		} catch (InputMismatchException exception) {
			throw new InvalidAgeException("Age should contain only digits");
		}
		if (age >= 18) {
			System.out.println("eligible to vote");
		} else {
			System.out.println("not eligible to vote");
		}
	}

	public static void main(String[] args) {

		MyCustomDemo customDemo = new MyCustomDemo();
		try {
			customDemo.checkAge();
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
