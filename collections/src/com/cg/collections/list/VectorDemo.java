package com.cg.collections.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<>();
		vector.add("cts");
		vector.add("ibm");
		vector.add("cg");
		vector.add("genpact");
		vector.add("tcs");
		vector.add("cts");
		/*vector.add(null);
		vector.add(null);*/
		System.out.println(vector);
		
		ListIterator<String> iterator = vector.listIterator();
		while(iterator.hasNext()){
			String s = iterator.next();
			if(s.equals("cts")) {
				iterator.set("CDK");
			}
		}
		System.out.println(vector);
		
		
		/*ListIterator<String> iterator = vector.listIterator();
		while(iterator.hasNext()){
			String s = iterator.next();
			if(s.equals("cts")) {
				iterator.add("CDK");
			}
		}
		System.out.println(vector);
		*/
		
		
		/*Enumeration<String> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			String string = enumeration.nextElement();
			System.out.println(string);
		}*/
		

		/*int count = 0;

		Iterator<String> iterator = vector.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().equals("cts")) {
				count++;
			}
		}

		System.out.println(count);
*/	}

}
