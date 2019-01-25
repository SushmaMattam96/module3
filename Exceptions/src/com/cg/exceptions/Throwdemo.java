package com.cg.exceptions;

public class Throwdemo {

	public static void main(String[] args) {

		int i = 0;

		try {
			i = 10 / 0;
			System.out.println(i);
		} catch (ArithmeticException e) {
			throw new ArithmeticException("divided by zero not there");
		}

	}

}
