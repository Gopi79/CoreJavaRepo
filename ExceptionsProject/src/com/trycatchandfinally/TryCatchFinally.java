package com.trycatchandfinally;

public class TryCatchFinally
{
	public static void main(String args[])
	{
		try
		{
			int a = 15;
			int b = 0;
			int c = a / b;
			System.out.println("a / b = " + c);
		}
		catch (Exception e)
		{
			System.out.println("Exception Thrown: " + e);
		}
		finally
		{
			System.out.println("Finally block executed!");
		}
	}
}
