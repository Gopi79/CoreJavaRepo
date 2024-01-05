package com.collectionsmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo_sort1 
{
	public static void main(String[] args) 
	{
		List l=new ArrayList();
		l.add(25);
		l.add(5);
		l.add(45);
		l.add(10);
		l.add(30);
		l.add(5);
		l.add(35);
		l.add(20);
		
		System.out.println("Befour sorting the List: "+l);
		
		Collections.sort(l);
		
		System.out.println("After Sorting the List :"+l);
	}
}
