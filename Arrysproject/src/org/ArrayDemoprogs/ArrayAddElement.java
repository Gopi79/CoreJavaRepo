package org.ArrayDemoprogs;

import java.util.Arrays;

public class ArrayAddElement 
{
	public static void main(String[] args) 
	{
		int [] arr= {1,2,3,4,4,5};
		int [] temp=new int[arr.length+1];
		//System.out.println(temp.length);
		int add=9;
		for(int i=0;i<arr.length;i++)
		{
			temp[i]=arr[i];
		}
		temp[arr.length]=add;
		for(int j=0;j<temp.length;j++)
		{
			System.out.print(temp[j]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(temp));
	}
}
