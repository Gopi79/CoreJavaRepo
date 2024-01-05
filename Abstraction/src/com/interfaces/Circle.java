package com.interfaces;

public class Circle implements Parameters
{
	int r=10;
	@Override
	public float area()
	{
		return pi*r*r;
	}
	public static void main(String[] args)
	{
		Circle cr=new Circle();
		System.out.println(cr.area());
	}
}
