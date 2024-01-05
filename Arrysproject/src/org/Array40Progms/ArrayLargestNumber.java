package org.Array40Progms;

public class ArrayLargestNumber 
{
	public static void main(String[] args) 
	{
		int [] arr= {4,7,2,1,6,3,8,9,0};
		int l=arr[0];
		for(int x:arr)
		{
			if(x>l)
				l=x;
		}
		System.out.println("Largest Value:"+l);
	}
}
