package org.Array40Progms;

public class ArrayRepetedElementsCount 
{
	public static void main(String[] args) 
	{
		int [] arr= {1,3,5,1,4,3,6,4,5,7,6,9,8,0,9};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int count=0;
		for(int x=0;x<arr.length;x++)
		{
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[x]==arr[y])
				{
					count++;
				}
			}
		}
		System.out.println("Array Repeated Elements Count:"+count);
	}
}
