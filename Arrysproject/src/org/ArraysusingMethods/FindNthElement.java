package org.ArraysusingMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindNthElement 
{
	public static void main(String[] args) throws IOException 
	{
		int[] arr = { 2, 5, 7, 9, 10, 15, 19 };
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter nth position");
		String str = br.readLine();
		int n = Integer.parseInt(str);
		int nthElement = FindNthElement.findNthElement(arr, n);
		if (nthElement != -1)
			System.out.println("The " + n + "th element in the given array is: " + nthElement);
		else
			System.out.println("Invalid position. Please enter a valid position.");
	}
	static int findNthElement(int[] arr, int n) 
	{
		if (n >= 1 && n <= arr.length)
			return arr[n - 1];
		else
			return -1;
	}
}
