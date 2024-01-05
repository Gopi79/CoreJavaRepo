package com.arraymethods;

import java.util.Arrays;

public class ArraySearchDemo 
{
	public static void main(String[] args) 
	{
		int [] arr= {10,5,20,11,6};
		Arrays.sort(arr);
		
		System.out.println(Arrays.binarySearch(arr, 6)); // 1
		
		System.out.println(Arrays.binarySearch(arr, 14)); //-5
		
		String []s= {"A","Z","B"};
		Arrays.sort(s);
		
		System.out.println(Arrays.binarySearch(s, "Z")); // 2
		
		System.out.println(Arrays.binarySearch(s, "L"));// -3
		
		Arrays.sort(s, new Mycompar());
		
		System.out.println(Arrays.binarySearch(s, "Z",new Mycompar()));// 0
		
		System.out.println(Arrays.binarySearch(s, "S", new Mycompar())); //-2
		
		System.out.println(Arrays.binarySearch(s, "N")); //-4
		
		
	}
}
