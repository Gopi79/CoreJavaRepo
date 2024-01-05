package com.setexamples;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample 
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("Z");
		hs.add(null);
		hs.add(10);
		
		System.out.println(hs);
		
		Iterator itr=hs.iterator();
		while (itr.hasNext()) {
			Object object = (Object) itr.next();
			System.out.println(object);
		}
		
		
	}
}
