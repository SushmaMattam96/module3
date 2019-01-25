package com.cg.controller;

import java.util.Scanner;

import com.cg.exceptions.InvalidPinException;

public class Main {

	public static void checkPin(String pin) throws InvalidPinException {

		int iPin = 0;

		if (pin.length() == 4) {

			try {
				iPin = Integer.parseInt(pin);
				System.out.println(iPin);
			} catch (NumberFormatException e) {
				throw new InvalidPinException("PIN should contain only digits");
			}

		} else {
			System.out.println("Enter Exactly 4 digits");
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter PIN");
		String pin = scanner.next();

		try {
			Main.checkPin(pin);
		} catch (InvalidPinException e) {
			System.out.println(e.getMessage());
		}

	}
}
