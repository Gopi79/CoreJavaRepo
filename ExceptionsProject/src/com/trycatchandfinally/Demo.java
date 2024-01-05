package com.trycatchandfinally;

public class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("main method.");
		try
		{
			System.out.println("try block started.");
			String s=null;
			s.length();
			System.out.println("try block ended.");
		}
		catch(Exception e)
		{
			System.out.println("catch block statred.");
			e.printStackTrace();
		}
		System.out.println("main ended.");
	}
}
