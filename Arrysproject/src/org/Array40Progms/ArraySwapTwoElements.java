package org.Array40Progms;

import java.util.Arrays;

public class ArraySwapTwoElements 
{
	public static void main(String[] args) 
	{
		int [] arr= {18,11,35,10,76,12,44,89};
		for(int i=0;i<arr.length-1;i=i+2) 
		{
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
