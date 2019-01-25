package com.cg.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();

		int array[] = new int[size];

		System.out.println("Add " + size + " elements to the array");

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("Elements in the array beofre sort");

		for (int value : array) {
			System.out.println(value);
		}

		Arrays.sort(array);
		System.out.println("Elements in the array after sort");

		for (int value : array) {
			System.out.println(value);
		}
	}

}





