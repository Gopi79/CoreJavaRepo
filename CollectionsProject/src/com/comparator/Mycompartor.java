package com.comparator;

import java.util.Comparator;

public class Mycompartor implements Comparator
{
	@Override
	public int compare(Object obj1, Object obj2)
	{
		String str1=obj1.toString();
		String str2=obj2.toString();
		return str1.compareTo(str2); //  A to Z order
		//return -str1.compareTo(str2); //Z to A order
	}
}
