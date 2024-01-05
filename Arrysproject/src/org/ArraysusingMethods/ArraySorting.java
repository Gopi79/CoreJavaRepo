package org.ArraysusingMethods;

import java.util.Arrays;

public class ArraySorting 
{
	public static void main(String[] args) 
	{
		int[] arr = { 5, 8, 2, 6, 9, 3 };
		ArraySorting.sortArrayDescending(arr);
		System.out.println(Arrays.toString(arr));
	}
	static int[] sortArrayDescending(int[] arr) 
	{
		int temp = 0;
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i + 1; j < arr.length; j++) 
			{
				if (arr[i] < arr[j]) 
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
