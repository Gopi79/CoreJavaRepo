package com.sortedmap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo 
{
	public static void main(String[] args) 
	{
		SortedMap sm=new TreeMap();
		sm.put(105, "Alex");
		sm.put(102, "Petter");
		sm.put(109, "Mark");
		sm.put(101, "Seri");
		sm.put(100, "John");
		sm.put(107, "Lavender");
		
		//	SortedMap Methods are 
		
		System.out.println(sm.firstKey()); //100
		
		System.out.println(sm.lastKey()); //109
		
		System.out.println(sm.headMap(105)); //{100=John, 101=Seri, 102=Petter}
		
		System.out.println(sm.tailMap(102)); //{102=Petter, 105=Alex, 107=Lavender, 109=Mark}
		
		System.out.println(sm.subMap(102, 107)); //{102=Petter, 105=Alex}
		
		System.out.println(sm.comparator()); //
	}
}
