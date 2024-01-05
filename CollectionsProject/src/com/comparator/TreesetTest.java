package com.comparator;

import java.util.TreeSet;

public class TreesetTest 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new Mycompartor());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		
		System.out.println(t);
	}
}
