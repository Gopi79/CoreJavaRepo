package com.setexamples;

import java.util.TreeSet;

public class TreeSetDemo 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		t.add(new StringBuffer("Alex"));
		t.add(new StringBuffer("Mark"));
		t.add(new StringBuffer("Jhon"));
		t.add(new StringBuffer("Seri"));
		t.add(new StringBuffer("Ram"));
		
		System.out.println(t);
	}
}