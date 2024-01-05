package com.stringTaskPrograms;

import java.util.Arrays;

public class StringtoIntegerArray 
{
	public static void main(String[] args) 
	{
		String str ="[1,2,3,4,5,6]";
		String[] string=str.replaceAll("\\[","").replaceAll("]", "").split(",");
		int arr[]=new int[string.length];
		for(int i=0;i<string.length;i++)
		{
		    arr[i]=Integer.valueOf(string[i]);
		}
		System.out.println("String:"+str);
		System.out.println("Integer Array:"+Arrays.toString(arr));
	}
}
