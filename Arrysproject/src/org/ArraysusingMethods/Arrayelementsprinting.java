package org.ArraysusingMethods;

import java.util.Arrays;

public class Arrayelementsprinting 
{
	public static void main(String[] args) 
	{
		int arr[] = { 5, 8, 2, 6, 9, 3 };
		Arrayelementsprinting.printArrayUsingForLoop(arr);
		Arrayelementsprinting.printArrayUsingEnhancedForLoop(arr);
		Arrayelementsprinting.printArrayUsingArraysToString(arr);
	}
	static int[] printArrayUsingForLoop(int[] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		return arr;
	}
	static int[] printArrayUsingEnhancedForLoop(int[] arr) 
	{
		for (int x : arr) 
		{
			System.out.print(x + " ");
		}
		System.out.println();
		return arr;
	}
	static int[] printArrayUsingArraysToString(int[] arr) 
	{
		System.out.println(Arrays.toString(arr));
		return arr;
	}
}
