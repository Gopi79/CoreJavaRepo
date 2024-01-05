package org.Array40Progms;

public class ArraySumOfElements 
{
	public static void main(String[] args) 
	{
		int [] arr= {5,2,7,1,9};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum of Array Elements :"+sum);
	}
}
