package com.listprogrames;

import java.util.List;
import java.util.Vector;

public class Sample 
{
	public static void main(String[] args)
	{
		List l= new Vector();
		
		l.add(10);
		l.add("Ram");
		l.add(10.05f);
		l.add('M');
		
		System.out.println(l);
		
	}
}
