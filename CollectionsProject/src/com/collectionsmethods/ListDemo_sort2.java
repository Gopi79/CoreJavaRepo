package com.collectionsmethods;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo_sort2 
{
	public static void main(String[] args)
	{
		ArrayList l=new ArrayList();
		l.add("Bun");
		l.add("React");
		l.add("Angulur");
		l.add("Spring");
		l.add("Java");
		l.add("Bootstrap");
		l.add("Typescript");
		l.add("JavaScript");
		
		System.out.println("Befour sorting the list:"+l);
		
		Collections.sort(l,new MyComparator1());
		
		System.out.println("After sorting the List:"+l);
		
	}
}
