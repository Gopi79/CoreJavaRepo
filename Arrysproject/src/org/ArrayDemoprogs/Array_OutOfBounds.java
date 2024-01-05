package org.ArrayDemoprogs;

public class Array_OutOfBounds 
{
	public static void main(String[] args) 
	{
		int [] arr= {101,102,103};
		arr[0]=10;
		arr[1]=20;
		System.out.println(arr[2]);
		System.out.println(arr[101]);
	}
}
