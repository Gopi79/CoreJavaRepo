package com.nestedtryblock;

public class NestedTry 
{
	public static void main(String[] args)
	{
		System.out.println("Main method start.");
		try
		{
			int [] arr= {1,2,3,4,5};
			System.out.println(arr[5]);
			try
			{
				int x=arr[2]/0;
			}
			catch (ArithmeticException e)
			{
				System.out.println("Division by Zero is not possible");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bound Exception.");
			System.out.println("Element at such index is not Exist.");
		}
	}
}
