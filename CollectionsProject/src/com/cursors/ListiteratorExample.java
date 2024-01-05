package com.cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListiteratorExample 
{
	public static void main(String[] args) 
	{
		//LinkedList
		LinkedList l=new LinkedList();
		
		l.add(10);
		l.add('a');
		l.add(3.14f);
		l.add("Lavender");
		l.add(123456789345L);
		l.add(25.25d);
		
		//Forword Direction
		System.out.println("========LinkedList Forword Direction===============");
		ListIterator lir=l.listIterator();
		while(lir.hasNext())
		{
			Object obj=(Object)lir.next();
			System.out.println(obj);
		}
		//Backword Direction
		System.out.println("========LinkedList Backword Direction===============");
		while(lir.hasPrevious())
		{
			Object objl=(Object)lir.previous();
			System.out.println(objl);
		}
		
		//Remove
		/*
		 * System.out.println("========LinkedList Remove Element===============");
		 * while(lir.hasNext()) { Object obj=(Object)lir.next(); if(obj.equals(10)) {
		 * lir.remove(); } } System.out.println(l);
		 */
		
		//Set
		/*
		 * System.out.
		 * println("========LinkedList Update Set-Method Element===============");
		 * while(lir.hasNext()) { Object obj=(Object)lir.next(); if(obj.equals('a')) {
		 * lir.set('A'); } } System.out.println(l);
		 */
		
		//add
		System.out.println("========LinkedList add-Method Element===============");
		while(lir.hasNext())
		{
			Object obj1=(Object)lir.next();
			if(obj1.equals("Lavender"))
			{
				lir.add("Alex");
			}
		}
		System.out.println(l);
		
	}
}
