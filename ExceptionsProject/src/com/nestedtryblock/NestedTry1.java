package com.nestedtryblock;

public class NestedTry1
{
	public static void main(String[] args)
	{
		try
		{
			nestedTry();
		}
		catch (Exception e)
		{
			System.out.println("NumberFormatException will be caught here");
		}
	}

	static void nestedTry()
	{
		try
		{
			int i = Integer.parseInt("abc"); 
		}
		catch (NullPointerException e)
		{
			System.out.println("NumberFormatException will not be caught here");
		}
	}
}
