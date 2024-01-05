package com.blocks;

public class Example
{
	{
		System.out.println("Instance block1");
	}
	public Example()
	{
		System.out.println("Constructor");
	}
	public static void main(String[] args)
	{
		Example ex=new Example();
		System.out.println("main method.");
	}
}
