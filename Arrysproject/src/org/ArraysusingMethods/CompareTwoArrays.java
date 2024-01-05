package org.ArraysusingMethods;

import java.util.Arrays;

public class CompareTwoArrays
{
	public static void main(String[] args)
	{
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = arr1;
		int[] arr3 = { 10, 30, 15, 63, 60 };
		int[] arr4 = { 10, 20, 30, 40 };
		System.out.println(CompareTwoArrays.compareAndPrint(arr1, arr2));
		System.out.println(CompareTwoArrays.compareAndPrint(arr2, arr3));
		System.out.println(CompareTwoArrays.compareAndPrint(arr3, arr4));
	}
	static boolean compareAndPrint(int[] arr1, int[] arr2)
	{
		if (Arrays.equals(arr1, arr2))
			return true;
		else 
			return false;
		
	}
}
