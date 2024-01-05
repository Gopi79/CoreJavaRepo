package org.Array40Progms;

public class ArrayEvenPositions 
{
	public static void main(String[] args) 
	{
		int [] arr= {10,13,24,5,9,6,8};
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
				continue;
			}
		}
	}
}
