package com.cg.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(234);
		list.add(432);
		list.add(1212);
		//list.add(null);
		list.add(12);
		System.out.println(list);
		
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			int value = iterator.next();
			System.out.println(value);
		}
		
		
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=========================");
		
		for(int val : list) {
			System.out.println(val);
		}
		
		
		
		
		
		//System.out.println(list.size());
		
		//System.out.println(list.get(4));
		/*System.out.println(list.remove(2));
		System.out.println(list);*/
		
		
		/*List<Integer> list2 = new ArrayList<>();
		list2.add(1232);
		list2.add(890);
		list2.add(234);
		list2.addAll(1,list);
		System.out.println(list2);*/
		
		/*list.clear();
		System.out.println(list);*/
		
		//System.out.println(list2.isEmpty());

		
		/*list.add(4, 9090);
		System.out.println(list);
*/
	}

}
