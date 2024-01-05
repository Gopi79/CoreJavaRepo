package org.arrys;

import java.util.Arrays;

public class Arrayminmax1 
{
	public static void main(String[] args) 
	{
		int arr[]= {15,8,9,2,11,4};
		Arrays.sort(arr);
		System.out.println(arr[0]+" min value");
		System.out.println(arr[arr.length-1]+" max value");
	}
}
