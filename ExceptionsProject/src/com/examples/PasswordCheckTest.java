package com.examples;

public class PasswordCheckTest
{
	public static void main(String[] args) 
	{
		Password ps=new Password();
		try 
		{
			ps.valid("abc@125");
			System.out.println("correct password");
		} catch (PasswordException e) 
		{
			System.err.print(e);
		}
	}
}
