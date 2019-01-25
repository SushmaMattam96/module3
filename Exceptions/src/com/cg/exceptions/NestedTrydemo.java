package com.cg.exceptions;

public class NestedTrydemo {

	public static void main(String[] array) {

		String number = "";
		int value = 0;

		try {
			number = array[3];
			try {
				value = Integer.parseInt(number);
				System.out.println(value);
			} catch (NumberFormatException e) {
				System.out.println(e.toString());
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}

	}

}
