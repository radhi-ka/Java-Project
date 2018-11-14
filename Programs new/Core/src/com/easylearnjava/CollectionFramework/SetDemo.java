package com.easylearnjava.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		String s1 = null;

		 Set set = new HashSet();
		set.add(1);
		set.add(20);
		set.add(20);
		set.add("add");
		set.add("aaa");
		set.add("add");
		set.add(new Student());
		set.add(new Machine());
		set.add(new Student());
		set.add(s1);
		set.add(s1);
		
		// hashset
		// cannot store elements in order
		// duplicate values are neglected
		// cannot hold more than one null value
		
		System.out.println("The elements in set are : " + set);

		for (Object sw : set) {
			System.out.println("The elements in set are : " + sw);
		} 
		
		System.out.println();
		set = new TreeSet(); //the above hashset will be cleared after this line is executed becoz a new treeset is created with same obj
		set.add(1);
		set.add(20);
		set.add(20);
		/* If you add these it wont accept becoz treeset will accept only one type of objs
		 * it will give case cast exception
		set.add("add");
		set.add("aaa");
		set.add("add");
		set.add(new Student());
		set.add(new Machine());
		set.add(new Student());
		set.add(s1);
		set.add(s1); */
		
		/* TreeSet
		 * Accept similat type of objects
		 * elements will be sorted automatically
		 * cannot allow null value
		 */
		
		System.out.println("The elements in set are : " + set.size());

		for (Object sw : set) {
			System.out.println("The elements in set are : " + sw);
		}
		
		System.out.println();
		List arrlst=new ArrayList();
		arrlst.add(1);
		arrlst.add(4);
		arrlst.add(224);
		arrlst.add(224);
		arrlst.add(56);
		arrlst.add(634);
		arrlst.add(69);
		arrlst.add(6960); 
		
		Set s=new HashSet(arrlst);
				for(Object obj:arrlst) {
					System.out.println("Avoiding duplicate values " + obj);
				}
		arrlst=new ArrayList(s);
		Collections.sort(arrlst); //To sort arraylist
		System.out.println("The elements in set are : " + arrlst.size());

		for (Object sw : arrlst) {
			System.out.println("The elements in set are : " + sw);
		}
		
		
	}

}
