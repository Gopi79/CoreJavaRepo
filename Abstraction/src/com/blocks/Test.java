package com.blocks;

public class Test 
{
	{
		System.out.println("instance block");
	}
	public Test()
	{
		System.out.println("Constructor");
	}
	void draw()
	{
		System.out.println("instance method");
	}
	public static void main(String[] args)
	{
		Test ts=new Test();
		ts.draw();
		System.out.println("Main method");
	}
}
