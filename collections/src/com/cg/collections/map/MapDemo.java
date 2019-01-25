package com.cg.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<>();
		map.put(123, "capgemini");
		map.put(121, "cts");
		map.put(122, "tcs");
		map.put(123, "genpact");
		map.put(124, "adp");
		map.put(125, "cdk");
		/*map.put(null, null);
		map.put(null, "wipro");*/
		map.put(128, "wipro");

		System.out.println(map);

	}

}
