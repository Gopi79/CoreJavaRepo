package org.Array40Progms;

public class ArrayAverage 
{
	public static void main(String[] args)
	{
		int [] arr= {20,10,50,30,9};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		int avg=sum/arr.length;
		System.out.println("Average of arr is:"+avg);
	}
}
