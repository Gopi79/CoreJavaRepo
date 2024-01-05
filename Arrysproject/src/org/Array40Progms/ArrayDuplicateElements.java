package org.Array40Progms;

public class ArrayDuplicateElements 
{
	public static void main(String[] args) 
	{
		int [] arr= {1,4,7,2,4,5,8,2,1,6,3,7,5,8};
		int dup=0;
		System.out.println("Duplicate Elements:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					dup=arr[j];
					System.out.print(dup+" ");
				}
			}
		}
	}
}
