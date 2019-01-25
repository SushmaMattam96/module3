package com.cg.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {

		Employee employee1 = new Employee(12, "pavan", "trainer", 34000);
		Employee employee2 = new Employee(1212, "kumar", "TL", 54000);
		Employee employee3 = new Employee(1, "shanthi", "QE lead", 64000);
		Employee employee4 = new Employee(1123, "ravi", "PAT", 24000);

		List<Employee> list = new ArrayList<>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);

		Collections.sort(list);
		
		for(Employee employee : list) {
			System.out.println(employee);
		}

	}

}
