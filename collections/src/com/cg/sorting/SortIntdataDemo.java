package com.cg.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortIntdataDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(1223);
		list.add(121);
		list.add(124334);
		list.add(121212);
		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);
	}

}
