package org.Array40Progms;

import java.util.Arrays;

public class ArrayRemoveElement 
{
	public static void main(String[] args)
	{
		int arr[] = { 10, 20, 30, 40, 50 };
		int index = 3;
		System.out.println("Original array: " + Arrays.toString(arr));
		arr = removeElement(arr, index);
		System.out.println("New array: " + Arrays.toString(arr));
	}
	public static int[] removeElement(int[] arr, int index) 
	{
		if (arr == null || index < 0 || index >= arr.length)
		{
			System.out.println("Invalid array or index.");
			return arr;
		}
		int temp[] = new int[arr.length - 1];
		for (int i = 0, j = 0; i < arr.length; i++) 
		{
			if (i == index)
			{
				continue;
			}
			temp[j++] = arr[i];
		}
		return temp;
	}
}
