package com.throwexeption;

public class Test
{
	void m1()
	{
		m2();
	}
	void m2()
	{
		m1();
	}
	public static void main(String[] args)
	{
		System.out.println("main ( ) method - start");
		Test d = new Test();
		d.m1();
		System.out.println("main( ) method - end");
	}
}
