package org.ArraysusingMethods;

import java.util.Arrays;

public class Min_MaxElement
{
	public static void main(String[] args)
	{
		int arr[] = { 15, 8, 9, 2, 11, 4 };
		int min = Min_MaxElement.findMinElement(arr);
		int max = Min_MaxElement.findMaxElement(arr);
		System.out.println("Min Element: " + min);
		System.out.println("Max Element: " + max);
	}
	static int findMinElement(int[] arr)
	{
		Arrays.sort(arr);
		return arr[0];
	}
	static int findMaxElement(int[] arr)
	{
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}
}
