package com.ArrayListexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Alist 
{
	public static void main(String[] args) 
	{
//		Set s=new HashSet();
//		s.add(15);
//		s.add(25);
//		s.add(35);
		
		
		/*
		 * List sl=new ArrayList(); sl.add(10); sl.add(40);
		 */
		
		//creating ArrayList
		
		List l=new ArrayList();
		
		
//		List l1=new ArrayList();
		
		//Adding element in List
		l.add(40);
		l.add(10);
		l.add(30);
		l.add(20);
		l.add(50);
		
		
		//ArrayList iterations
		
		//enhanced  for loop
		
		/*
		 * for(Object x:l) { System.out.println(x); }
		 */
		
		//iteratores
		
		/*
		 * Iterator<Object> item=l.iterator();
		 * 
		 * while (item.hasNext()) { System.out.println(item.next()); }
		 */
		
		//forEach loop
		
//		l.forEach(item->System.out.println(item));
		
		//Adding specific element at specific element
		
//		l.add(2,"Mark");
		
//		l1.add(1, 10);
		
//		l1.addAll(l);
//		l1.add("Ram");
//		l1.add("Alex");
		
		
		//retriving elements in list
//		Object ele = l.get(2);
		
		//System.out.println(ele);
		
		//updating elements in list
		//Object update = l.set(1,15);
		
//		System.out.println(update);
//		System.out.println(l.get(1));
		
//		System.out.println(l);
		
		//remove elements in list
		
//		l.remove(2);
		
//		System.out.println(l);
		
//		l.clear();
		
//		System.out.println(l);
		
//		List<Integer> listNumbers = List.of(1, 2, 3, 4, 5, 6);
//		listNumbers.forEach(System.out::println);
		
//		l.addAll(s);
		
//		System.out.println(l1);
//		System.out.println(l1);
		
		
		//Search Elements
		/*
		 * if (l.contains(20)){ System.out.println("Object is Present"); } else {
		 * System.out.println("Object Not Present"); }
		 */
		
		/*
		 * int ele_index = l.indexOf(40); System.out.println(ele_index);
		 */
		
		/*
		 * int ele_last_index = l.lastIndexOf(40); System.out.println(l);
		 * System.out.println(ele_last_index);
		 */
		
		//sortings
		
		/*
		 * System.out.println("Before Sorting List Ele : "+l);
		 * 
		 * Collections.sort(l);
		 * 
		 * System.out.println("After Sorting List Ele : "+l);
		 */
		
		//shuffling Elements in List
		
		/*
		 * System.out.println("Before Shuffling Elements in List : "+l);
		 * 
		 * Collections.shuffle(l);
		 * 
		 * System.out.println("After Shuffling Elements in List : "+l);
		 */
		
		//reverse elements in List
		
		/*
		 * System.out.println(l); //before reverse Collections.reverse(l);
		 * System.out.println(l);//After reverse
		 */		
		
		//Extracting Portion of List
		/*
		 * System.out.println("Original List : "+l);
		 * 
		 * List sub_List = l.subList(1, 3);
		 * 
		 * System.out.println("SubList : "+sub_List);
		 */
		
		//Convertion of List To Array
		
		/*
		 * System.out.println("List : "+l);
		 * 
		 * Object[] arr = l.toArray();
		 * 
		 * System.out.println("Array"); for(Object x:arr) { System.out.println(x); }
		 */
	}
}
