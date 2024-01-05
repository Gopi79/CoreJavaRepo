package com.constructoroverloading;

public class Sub extends Super 
{
	int y;
	Sub(int x)
	{
		super(x);
		y=x;
	}
	Sub(int x,int y)
	{
		this(x);
	}
	public static void main(String[] args)
	{
		Sub s=new Sub(10);
		Sub su=new Sub(20,30);
	}
}
