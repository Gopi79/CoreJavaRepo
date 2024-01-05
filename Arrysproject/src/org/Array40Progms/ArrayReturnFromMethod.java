package org.Array40Progms;

import java.util.Arrays;

public class ArrayReturnFromMethod 
{
	public static void main(String[] args) 
	{
		int [] ar=readarray();
		System.out.println(Arrays.toString(ar));
	}
	static int [] readarray()
	{
		int [] arr= {10,50,30,60,100};
		return arr;
	}
}
