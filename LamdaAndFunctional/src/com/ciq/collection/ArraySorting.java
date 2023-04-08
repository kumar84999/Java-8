package com.ciq.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArraySorting {
	public static void main(String[] args) {
	ArrayList<Integer>list=new ArrayList();
	list.add(50);
	list.add(20);
	list.add(60);
	list.add(25);
	list.add(23);
	list.add(12);
	list.add(120);
	
	//using comparator sorting
	Collections.sort(list,new MyComparator());
	System.out.println(list);
	
	//implimenting comparator using lamda Expression
	
	ArrayList<Integer>list2=new ArrayList();
	list2.add(50);
	list2.add(20);
	list2.add(60);
	list2.add(25);
	list2.add(23);
	list2.add(12);
	list2.add(120);
	
	
	//Comparator<Integer> comp=(o1,o2)->o2-o1;
	//Collections.sort(list2,comp);
	//System.out.println(list2);
	
	
//	Collections.sort(list2,(o1,o2)->o2-o1);
//	System.out.println("comparator with lamda expression");
//	System.out.println(list2);
	
	
	//with annonymus class
	
	Collections.sort(list2,new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			
			return o2-o1;
		}
	});
	System.out.println(list2);
	}
}
