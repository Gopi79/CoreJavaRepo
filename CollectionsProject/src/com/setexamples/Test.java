package com.setexamples;

import java.util.TreeSet;

public class Test 
{
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		
		t.add(100);
		t.add(101);
		t.add(104);
		t.add(106);
		t.add(109);
		t.add(110);
		t.add(120);
		
		System.out.println(t);
		
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println(t.headSet(109));
		System.out.println(t.tailSet(109));
		System.out.println(t.subSet(104, 110));
		System.out.println(t.comparator());
	}
}
