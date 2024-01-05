package org.Array40Progms;

public class Array4thElement
{
	public static void main(String[] args) 
	{
		int [] arr= {2,6,4,7,9,3,1};
		
		for(int x=0;x<arr.length;x++)
		{
			if(arr[x]==arr[3])
				System.out.println("Array 4th Element:"+arr[x]);
		}
	}
}
