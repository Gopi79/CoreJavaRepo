package org.ArrayDemoprogs;

public class Array_Min_MaxElements 
{
	public static void main(String[] args) 
	{
		int [] arr= {2,4,8,6,1,3,9};
		
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Min Value:"+min);
		System.out.println("Max Value:"+max);
	}
}
