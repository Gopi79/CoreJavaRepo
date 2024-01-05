package org.Array40Progms;

import java.util.Arrays;

public class ArrayCopyOfArray 
{
	public static void main(String[] args) 
	{
		int [] arr= {10,20,30,40,50};
		
		int [] newarray=arr;
		
		System.out.println("Original Array");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Copy Array");
		System.out.println(Arrays.toString(newarray));
	}
}
