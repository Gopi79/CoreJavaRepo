package org.Array40Progms;

import java.util.Arrays;

public class ArrayRevers 
{
	public static void main(String[] args) 
	{
		int [] arr= {5,9,7,3,1,0,8};
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
