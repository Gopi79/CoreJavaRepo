package org.Array40Progms;

import java.util.Arrays;

public class ArrayReverseUsingwhileLoop 
{
	public static void main(String[] args) 
	{
		int [] arr= {2,4,5,1,6,7,3};
		int i=0;
		int j=arr.length-1;
		int temp;
		while(i<j)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
