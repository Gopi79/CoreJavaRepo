package com.comparator;

import java.util.TreeSet;

public class Test 
{
	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet(new MyComparator());
		ts.add(10);
		ts.add(0);
		ts.add(15);
		ts.add(5);
		ts.add(20);
		
		System.out.println(ts);
	}
}
