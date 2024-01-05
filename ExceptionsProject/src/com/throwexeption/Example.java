package com.throwexeption;

public class Example
{
	void m1(int a, int b)
	{
		System.out.println("m1() - started");
		try
		{
			int c = a / b;
			System.out.println(c);
		}
		catch (Exception e)
		{
			
		}
		System.out.println("m1() - ended");
	}
	public static void main(String[] args) throws Exception
	{
		System.out.println("main() - method started");
		Example d = new Example();
		d.m1(10, 0);
		System.out.println("main() - method ended");
	}
}
