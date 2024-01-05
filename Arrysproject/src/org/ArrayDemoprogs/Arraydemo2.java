package org.ArrayDemoprogs;

public class Arraydemo2 
{
	public static void main(String[] args) 
	{
		int [] arr=new int[3];
		
		
		//System.out.println(arr[3]);
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		//arr[3]=4;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		int [] arr2= {2,5,8,9};
		System.out.println(arr2.length);
		
	}
}
