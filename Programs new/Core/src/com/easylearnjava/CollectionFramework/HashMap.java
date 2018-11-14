package com.easylearnjava.CollectionFramework;

import java.util.Map;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map=(Map<Integer, String>) new HashMap();
		
		map.put(41,"raghu");
		map.put(2,"bramha");
		map.put(33, "sneha");
		
		System.out.println("The value is : " + map.get(1));
		
		
		Set s =map.keySet();
		for(Object obj:s) {
			System.out.println("The value is : " + map.get(obj));
		}
		
		System.out.println();
		/*map=new TreeSet();
		map.put(41,"raghu");
		map.put(2,"bramha");
		map.put(33, "sneha");
		map.put("abc",11);
		map.put("wsd", 32);
		System.out.println("The value is : " + map.get(1));
		*/
		
		s = map.keySet();
		for(Object obj:s) {
			System.out.println("The value is : " + map.get(obj));
		}
		
	}

}
