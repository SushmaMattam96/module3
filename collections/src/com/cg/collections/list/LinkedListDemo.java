package com.cg.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(12);
		list.add(234);
		list.add(432);
		list.add(1212);
		list.add(12);
		System.out.println(list);
		
		System.out.println(list.peekFirst());
		System.out.println(list);

	}

}
