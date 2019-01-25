package com.cg.comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		return new Integer(employee1.getId()).compareTo(employee2.getId());
	}

}
