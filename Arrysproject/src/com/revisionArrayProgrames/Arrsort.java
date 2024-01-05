package com.revisionArrayProgrames;

import java.util.Arrays;

public class Arrsort 
{
	public static void main(String[] args)
	{
		int []arr= {10,40,5,15,35,20,25,30,45};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Array MIN Element: "+arr[0]);
		
		System.out.println("Array MAX Element: "+arr[arr.length-1]);
	}	
}
