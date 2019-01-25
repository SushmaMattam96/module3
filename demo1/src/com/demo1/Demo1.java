package com.demo1;

import java.util.Scanner;

public class Demo1 {
	
	public static int checkWords(String input) {
		
		String arr[] = input.split(" ");		
		return arr.length;
	}


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		int result = Demo1.checkWords(input);
		System.out.println(result);

	}

	
}
