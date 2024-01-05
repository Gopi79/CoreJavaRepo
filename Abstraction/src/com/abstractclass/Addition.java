package com.abstractclass;

public class Addition extends MyTest 
{
	@Override
	public void calculate(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition: "+c);
	}
}
