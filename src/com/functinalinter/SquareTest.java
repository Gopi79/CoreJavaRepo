package com.functinalinter;

public class SquareTest 
{
	public static void main(String[] args) 
	{
		/*
		 * SquareDemo sd=new SquareDemo(); int square = sd.square(4);
		 * System.out.println("Square of Number is :"+square);
		 */
		Interfsq sq=(x)->x*x;
		int square = sq.square(5);
		System.out.println("Square of Number is :"+square);
	}
}
