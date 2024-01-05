package com.abstractclass;

public class Calculator
{
	public static void main(String[] args)
	{
		Addition add=new Addition();
		Substraction sub=new Substraction();
		Multiplication mul=new Multiplication();
		
		add.calculate(100,150);
		sub.calculate(20,10);
		mul.calculate(10,5);
	}
}
