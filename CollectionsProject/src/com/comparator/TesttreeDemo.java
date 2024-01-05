package com.comparator;

import java.util.TreeSet;

public class TesttreeDemo 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new MyTreeComparator());
		t.add("A");
		t.add(new StringBuffer("AAB"));
		t.add(new StringBuffer("AA"));
		t.add("xx");
		t.add("ABCD");
		t.add("A");
		
		System.out.println(t);
	}
}
