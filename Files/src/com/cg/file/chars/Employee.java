package com.cg.file.chars;

import java.io.Serializable;

public class Employee implements Serializable {
	int id = 900;
	String name = "aaaaa";
	transient double salary = 89000;

	public void test() {
		System.out.println("salary is: " + salary);
	}
}
