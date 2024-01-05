package org.Array40Progms;

import java.util.Arrays;

public class ArraySecondSmallestNumber 
{
	public static void main(String[] args) 
	{
		int [] arr= {10,20,5,3,7,8,9,1};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Second Smallest Element:"+arr[arr.length-2]);
	}
}
