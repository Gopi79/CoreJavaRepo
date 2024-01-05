package com.trywithfinall;

public class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method start.");
		try
		{
			System.out.println("try block start.");
			int res=10/0;
			System.out.println(res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic exception.");
		}
		finally
		{
			System.out.println("finally block.");
		}
		System.out.println("Main method ended.");
	}
}
