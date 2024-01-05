package org.ArrayDemoprogs;

import java.util.Arrays;

public class ArrayDecsendinSort {

	public static void main(String[] args)
	{
		int [] arr= {4,2,1,6,9,7};
		int temp=0;
		for(int a=0;a<arr.length;a++)
		{
			for(int b=a+1;b<arr.length;b++)
			{
				if(arr[a]<arr[b])
				{
					temp=arr[a];
					arr[a]=arr[b];
					arr[b]=temp;
				}
			}
		}
		System.out.println("Desendinig Order:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}
}
