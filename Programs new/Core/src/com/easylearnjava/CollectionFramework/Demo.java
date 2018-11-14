package com.easylearnjava.CollectionFramework;

import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String args[]) {

		List<Object> lst = (List<Object>) new Demo(); // Arraylist size can be increased dynamically
		System.out.println("The list of " + lst.size());
		lst.add(34);
		lst.add("hello");
		lst.add(23);
		lst.add("s1");
		lst.add(new Machine());
		lst.add(new Student());
		//elements are ordered
		// stores duplicate values
		//multiple null values are stored
		System.out.println("The list of " + lst.size());
		lst.add(90);
		System.out.println("The list of " + lst.size());
		System.out.println("The contents are: " + lst.get(1));// capacity is different from size

		System.out.println();
		for (int i = 0; i < lst.size(); i++) {
			System.out.println("The values in the arraylist at " + i + "are : " + lst.get(i));
		}
		for(Object abcd:lst) {
			System.out.println("The values in the arraylist at are : " + abcd);
		}
		System.out.println();
		Iterator<Object> itr=lst.iterator();
		while(itr.hasNext()) {
			System.out.println("The values in the arraylist at are : " + itr.next());
		}
		
		//list iterator is different from iterator
		//list iterator litr=lst.iterator();
		//while(litr.hasNext())
		//litr.next()
		//(litr.hasPrevious)
		//litr.previous()
		
	}

}
