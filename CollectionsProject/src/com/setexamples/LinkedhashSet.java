package com.setexamples;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashSet 
{
	public static void main(String[] args) 
	{
		LinkedHashSet ls=new LinkedHashSet();
		ls.add("B");
		ls.add("C");
		ls.add("D");
		ls.add("Z");
		ls.add(null);
		ls.add(10);
		
		System.out.println(ls);
		
		Iterator itr=ls.iterator();
		while (itr.hasNext()) {
			Object obj = (Object) itr.next();
			System.out.println(obj);
		}
	}
}
