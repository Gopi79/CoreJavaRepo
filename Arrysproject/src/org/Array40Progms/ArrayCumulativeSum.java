package org.Array40Progms;

public class ArrayCumulativeSum 
{
	public static void main(String[] args) 
	{
		int [] arr= {1,7,3,9,4,0,5};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			arr[i]=sum;
		}
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
 	}
}
