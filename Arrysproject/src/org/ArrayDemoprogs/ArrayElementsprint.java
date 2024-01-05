package org.ArrayDemoprogs;

public class ArrayElementsprint 
{
	public static void main(String[] args) 
	{
		int [] arr= {5,7,3,1,9,6};
		//By using for loop
		for(int a=0;a<arr.length;a++)
		{
			System.out.print(arr[a]+" ");
		}
		System.out.println();
		//By using for each loop
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
}
