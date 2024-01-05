package com.trycatchandfinally;

public class Drive 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started.");
		try
		{
			System.out.println("try block started.");
			String s="hi";
			int i=s.length();
			System.out.println("try block ended.");
		}
		catch(ArithmeticException e)
		{
			System.out.println("in catch block");
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			System.out.println("in catch block");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("main method is ended.");
	}
}
