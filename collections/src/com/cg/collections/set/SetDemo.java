package com.cg.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>();
		set.add("cts");
		set.add("tcs");
		set.add("cts");
		//set.add(12);
		set.add("tcs");
		set.add("ibm");
		set.add("capgemini");
		set.add("cdk");
		set.add("adp");
		//set.add(null);

		System.out.println(set);

	}

}
