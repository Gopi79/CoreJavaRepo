package org.ArrayDemoprogs;

public class Array_SumMatchingpairs 
{
	public static void main(String[] args) 
	{
		int [] arr= {3,2,5,7,6,1};
		int sum=8;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
					System.out.println(arr[i]+"+"+arr[j]+"="+sum);
			}
		}
	}
}
