package com.comparable;

import java.util.TreeSet;

public class TreeSetExample 
{
	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add(10); //[10]
		ts.add(0); //10.compare with-->0[0,10]
		ts.add(15); // 15.compare with 0-->[0,15,10] ,15.compare with 10---->[0,10,15]
		ts.add(10); // 10.compare with-->0[0,10,15] 10.compare with-->10[0,10,15]
		
		System.out.println(ts); // [0,10,15]
	}
}
