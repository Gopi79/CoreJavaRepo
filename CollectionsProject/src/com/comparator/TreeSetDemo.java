package com.comparator;

import java.util.TreeSet;

public class TreeSetDemo 
{
	public static void main(String[] args)
	{
		TreeSet t=new TreeSet(new Mycomparatore());
		t.add("Roja");
		t.add("ShobaRani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("Ramulamma");
		
		System.out.println(t);
	}
}
