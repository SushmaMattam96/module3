package com.cg.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo1 {

	public static List<String> getEmployeeNames(HashMap<String, String> hashMap, String input) {

		List<String> list = new ArrayList<>();

		/*
		 * Set<String> set = hashMap.keySet(); Iterator<String> iterator =
		 * set.iterator();
		 * 
		 * while (iterator.hasNext()) { String empName = iterator.next(); String orgName
		 * = hashMap.get(empName);
		 * 
		 * if (orgName.equals(input)) { list.add(empName); } }
		 */

		Set<Entry<String, String>> set = hashMap.entrySet();
		Iterator<Entry<String, String>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			String empName = entry.getKey();
			String orgName = entry.getValue();

			if (orgName.equals(input)) {
				list.add(empName);
			}
		}
		return list;
	}

	public static void main(String[] args) {

		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("Ajay", "cognizant");
		hashMap.put("sankar", "capgemini");
		hashMap.put("pavan", "capgemini");
		hashMap.put("suresh", "tcs");
		hashMap.put("ravi", "wipro");
		hashMap.put("jai", "capgemini");

		String input = "capgemini";

		List<String> list = MapDemo1.getEmployeeNames(hashMap, input);
		System.out.println(list);

	}

}
