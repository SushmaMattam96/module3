package com.cg.exceptions;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		System.out.println("in main");
		System.out.println("before logic");
		System.out.println("before logic");
		System.out.println("before logic");
		System.out.println("before logic");
		System.out.println("before logic");

		int i = 0;
		try {
			i = 10 / 0;
		} catch (ArithmeticException e) {
			//System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println(i);

		System.out.println("after logic");
		System.out.println("after logic");
		System.out.println("after logic");
		System.out.println("after logic");
		System.out.println("after logic");
		System.out.println("after logic");
		System.out.println("after logic");

	}

}
