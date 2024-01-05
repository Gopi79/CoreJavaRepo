package com.trycatchandfinally;

public class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		try
		{
			System.out.println("try block started.");
			String s="hi";
			int i=s.length();
			System.out.println("try block ended.");
		}
		catch(Exception e)
		{
			System.out.println("catch block started.");
			e.printStackTrace();
		}
		System.out.println("main method ended.");
	}
}
