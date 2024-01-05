package com.queues;

import java.util.Comparator;

public class MyComparator implements Comparator
{
	@Override
	public int compare(Object obj1, Object obj2) {
		return -((Character) obj1).compareTo((Character) obj2);
	}	
}