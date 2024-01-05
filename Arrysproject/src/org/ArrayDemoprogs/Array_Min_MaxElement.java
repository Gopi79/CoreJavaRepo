package org.ArrayDemoprogs;

import java.util.Arrays;

public class Array_Min_MaxElement 
{
	public static void main(String[] args) 
	{
		int arr[]= {9,4,8,5,7,1,6};
		Arrays.sort(arr);
		System.out.println("Min_value:"+arr[0]);
		System.out.println("Max_value:"+arr[arr.length-1]);
	}
}
