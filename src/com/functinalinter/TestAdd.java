package com.functinalinter;

public class TestAdd 
{
	public static void main(String[] args) 
	{
		/*
		 * Add a=new Add(); a.add(10, 20);
		 */
		Interfs fs=(int a,int b)->System.out.println("Sum of Two Numbers:"+(a+b));
		fs.add(100, 200);
	}
}
