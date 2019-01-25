package com.demo2;

import java.util.Scanner;

import com.demo1.Demo1;

public class Demo2 {

	private static String getString(String input) {

		StringBuilder builder = new StringBuilder();

		String arr[] = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			builder.append(s.charAt(0));
		}

		return builder.toString().toUpperCase();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		String result = Demo2.getString(input);
		System.out.println(result);

	}

}
