package com.cg.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIterationDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(123, "capgemini");
		map.put(121, "cts");
		map.put(122, "tcs");
		map.put(123, "genpact");
		map.put(124, "adp");
		map.put(125, "cdk");
		
		//to get key-value pairs - entrySet()		
		Set<Entry<Integer, String>> set = map.entrySet();
		Iterator<Entry<Integer, String>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
		
		
		
		
		
		//to get key-value pairs - keySet()
		/*Set<Integer> keys = map.keySet();
		Iterator<Integer> iterator = keys.iterator();

		while (iterator.hasNext()) {
			int key = iterator.next();
			String value = map.get(key);
			System.out.println(key + "--" + value);
		}*/
		
		// to get only values
		/*Collection<String> collection = map.values();
		System.out.println(collection);
		for (String orgName : collection) {
			System.out.println(orgName);
		}
		
		System.out.println("===============================");
		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
	}
}







