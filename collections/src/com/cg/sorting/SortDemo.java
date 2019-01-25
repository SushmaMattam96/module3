package com.cg.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("cts");
		list.add("adp");
		list.add("cdk");
		list.add("capgemini");
		list.add("tcs");
		list.add("wipro");
		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);

	}

}
