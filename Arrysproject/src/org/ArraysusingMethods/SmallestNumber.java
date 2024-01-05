package org.ArraysusingMethods;

import java.util.Arrays;

public class SmallestNumber {

	public static void main(String[] args) 
	{
		int[] arr = { 8, 15, 21, 18, 25, 6, 31 };
		Arrays.sort(arr);
		System.out.println("Smallest number in an Array");
		System.out.println(SmallestNumber.findSmallestUsingSort(arr));
	}
	static int findSmallestUsingSort(int[] arr) 
	{
		Arrays.sort(arr);
		return arr[0];
	}
}
