package com.cg.arrays;

public class Arraysdemo {

	public static void main(String[] args) {

		int size = 10;
		int arr[] = new int[size];
		arr[0] = 12;
		arr[1] = 23;
		arr[4] = 45;
		
		for (int id : arr) {
			System.out.println(id);
		}

		/*for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/

	}

}
