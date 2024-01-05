package com.searchincollections;

import java.util.Comparator;

public class Mycomparator implements Comparator
{
	@Override
	public int compare(Object obj1, Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		return i2.compareTo(i1);
	}
}
