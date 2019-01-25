package com.cg.exceptions;

public class FlowExceptionDemo {

	public void testException1() {
		System.out.println("in test 1 method..");
		int arr[] = { 2, 3, 4, 451 };
		System.out.println(arr[10]);
		System.out.println("in test 1 ended..");
	}

	public void testException2() {
		System.out.println("in test 2 method..");
		testException1();
		System.out.println("in test 2 ended..");
	}

	public static void main(String[] args) {

		System.out.println("main started..");
		FlowExceptionDemo demo = new FlowExceptionDemo();
		try {
			demo.testException2();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("main ended..");
	}

}
