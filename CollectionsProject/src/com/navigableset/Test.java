package com.navigableset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test 
{
	public static void main(String[] args)
	{
		NavigableSet ns=new TreeSet();
		ns.add(97);
		ns.add(26);
		ns.add(40);
		ns.add(10);
		ns.add(30);
		ns.add(5);
		ns.add(88);
		ns.add(36);
		ns.add(112);
		
		System.out.println(ns);
		
		System.out.println(ns.ceiling(32));
		
		System.out.println(ns.floor(43));
		
		System.out.println(ns.higher(25));
		
		System.out.println(ns.lower(88));
		
		System.out.println(ns.pollFirst());
		
		System.out.println(ns);
		
		System.out.println(ns.pollLast());
		
		System.out.println(ns);
		
		System.out.println(ns.descendingSet());
	}
}
