package org.ArraysusingMethods;

import java.util.Arrays;

public class Addelement 
{
	public static void main(String[] args) 
	{
		int[] arr = { 1, 2, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));
		int add = 6;
		int[] temparr = addElement(arr, add);
		System.out.println(Arrays.toString(temparr));
		
	}
	public static int[] addElement(int[] arr, int element) 
	{
		int[] temparr = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) 
		{
			temparr[i] = arr[i];
		}
		temparr[arr.length] = element;
		return temparr;
	}
}
