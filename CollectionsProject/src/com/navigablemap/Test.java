package com.navigablemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Test 
{
	public static void main(String[] args)
	{
		NavigableMap nm=new TreeMap();
		nm.put("b","banana");
		nm.put("c","cat");
		nm.put("a", "apple");
		nm.put("d","dog");
		nm.put("g","gun");
		
		System.out.println(nm);
		
		System.out.println(nm.ceilingKey("e"));
		
		System.out.println(nm.floorKey("c"));
		
		System.out.println(nm.higherKey("a"));
		
		System.out.println(nm.lowerKey("g"));
		
		System.out.println(nm.pollFirstEntry());
		
		System.out.println(nm);
		
		System.out.println(nm.pollLastEntry());
		
		System.out.println(nm);
		
		System.out.println(nm.descendingMap());
	}
}
