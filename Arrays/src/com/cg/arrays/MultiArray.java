package com.cg.arrays;

import java.util.Scanner;

public class MultiArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the row size");
		int rowSize = scanner.nextInt();
		int columnSize = scanner.nextInt();

		int array[][] = new int[rowSize][columnSize];

		System.out.println("Add " + rowSize + " X " + columnSize + "elements to the array");

		for (int i = 0; i < rowSize; i++) {

			for (int j = 0; j < columnSize; j++) {
				array[i][j] = scanner.nextInt();
			}
		}

		System.out.println("elements in the array ");

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length; j++) {
				System.out.print("array[" + i + "][" + j + "] : " + array[i][j]);
			}
			System.out.println();
		}

	}

}
