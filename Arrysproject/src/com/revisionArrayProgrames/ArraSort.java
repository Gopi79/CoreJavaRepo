package com.revisionArrayProgrames;

public class ArraSort
{
	public static void main(String[] args) 
	{
		int []arr= {4,2,7,5,1,3,9,6,8};
		
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("MIN Element : "+min);
		System.out.println("MAX Element : "+max);
	}
}
