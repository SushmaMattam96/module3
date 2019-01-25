package com.cg.arrays.referenceType;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("How many employees u want to add:");
		int input = scanner.nextInt();

		//int arr[] = new int[size];

		Employee employees[] = new Employee[input];

		for (int i = 0; i < employees.length; i++) {
			System.out.println("Enter Id");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Name:");
			String name = scanner.nextLine();
			System.out.println("Enter desig");
			String desig = scanner.nextLine();
			Employee employee = new Employee(id, name, desig);
			employees[i] = employee;
		}

		System.out.println("Employee details are:");
		for (Employee employee : employees) {
			System.out.println(employee.getId() + ":" + employee.getName() + ":" + employee.getDesig());
		}
	}
}
