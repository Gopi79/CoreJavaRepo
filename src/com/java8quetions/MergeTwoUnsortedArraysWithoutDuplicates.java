package com.java8quetions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArraysWithoutDuplicates 
{
	public static void main(String[] args) 
	{
		int []a=new int[] {4,2,5,1};
		int []b=new int[] {8,1,9,5};
		
		int []c=IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().distinct().toArray();
		System.out.println(Arrays.toString(c));
	}
}
