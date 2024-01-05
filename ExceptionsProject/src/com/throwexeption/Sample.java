package com.throwexeption;

public class Sample
{
	void m2(int a, int b) throws Exception
	{
		System.out.println("m2() - started");
		try
		{
			int c = a / b;
			System.out.println(c);
		}
		catch (Exception e)
		{
			throw new InvalidNumberException("invalid number");
		}
		System.out.println("m2() - ended");
	}
	void m1(int a, int b) throws Exception
	{
		System.out.println("m1() - started");
		m2(a, b);
		System.out.println("m1() - ended");
	}
	public static void main(String[] args)
	{
		System.out.println("main() - method started");
		try
		{
			Sample d = new Sample();
			d.m1(10, 0);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("main() - method ended");
	}
}
