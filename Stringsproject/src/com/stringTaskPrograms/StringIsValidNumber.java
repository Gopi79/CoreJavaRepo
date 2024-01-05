package com.stringTaskPrograms;

public class StringIsValidNumber 
{
	public static void main(String[] args)
	{
		String input1 ="abc";
		String input2 ="1523165";
		try 
		{
		  Integer.parseInt(input1);
		  System.out.println(input1+"-"+"is a valid integer number");
		}
		catch(NumberFormatException e)
		{
			System.out.println(input1+"-"+"is not a valid integer number");
		}
		try
		{
			Integer.parseInt(input2);
			System.out.println(input2+"-"+"is a valid integer number");
		}
		catch(NumberFormatException e)
		{
			System.out.println(input2+"-"+"is not a valid integer number");
		}
	}
}
