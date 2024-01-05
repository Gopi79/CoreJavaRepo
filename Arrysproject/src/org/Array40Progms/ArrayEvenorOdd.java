package org.Array40Progms;

public class ArrayEvenorOdd 
{
	public static void main(String[] args) 
	{
		int [] arr= {2,5,6,7,8,9,4,1};
		System.out.println("Even Number Elements in an arry:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Odd Number Elements in an arry:");
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]%2!=0)
				System.out.print(arr[j]+" ");
		}
	}
}
