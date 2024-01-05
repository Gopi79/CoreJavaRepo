package com.revisionArrayProgrames;

import java.util.Arrays;

public class ArrayassendingSort 
{
	public static void main(String[] args)
	{
		int []arr= {4,2,7,5,1,3,9,6,8};
		
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
