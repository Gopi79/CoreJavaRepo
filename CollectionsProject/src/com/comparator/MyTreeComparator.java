package com.comparator;

import java.util.Comparator;

public class MyTreeComparator implements Comparator
{
	@Override
	public int compare(Object obj1, Object obj2) 
	{
		String str1=obj1.toString();
		String str2=obj2.toString();
		int l1=str1.length();
		int l2=str2.length();
		if (l1<l2) {
			return -1;
		}
		else if (l1>l2) {
			return 1;
		}
		else
		{
			return str1.compareTo(str2);
		}
	}
}
