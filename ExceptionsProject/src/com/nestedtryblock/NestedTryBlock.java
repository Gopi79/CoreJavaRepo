package com.nestedtryblock;

public class NestedTryBlock 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method start.");
		try 
		{
			try
			{
				System.out.println("nested try block 1");
				int c=10/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			try
			{
				int a[]=new int[5];
				a[5]=4;
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
		}
		catch (Exception e) 
		{
			System.out.println("Handling the Exception on Outer Catch block.");
		}
		System.out.println("Main method ended.");
	}
}
