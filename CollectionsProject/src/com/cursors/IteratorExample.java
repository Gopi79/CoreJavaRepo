package com.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorExample 
{
	public static void main(String[] args) 
	{
		//ArrayList
		System.out.println("=============ArrayList=============");
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add('A');
		al.add(10.5f);
		al.add("Alex");
		al.add(15000000000L);
		al.add(19.99d);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Object obj=(Object)itr.next();
			System.out.println(obj);
		}
		
		//LinkedList
		System.out.println("=============LinkedList=============");
		LinkedList l=new LinkedList();
		
		l.add(10);
		l.add('a');
		l.add(3.14f);
		l.add("Lavender");
		l.add(123456789345L);
		l.add(25.25d);
		
		Iterator itl=l.iterator();
		while(itl.hasNext())
		{
			Object objl=(Object)itl.next();
			System.out.println(objl);
		}
	}
}
