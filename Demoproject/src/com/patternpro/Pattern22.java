package com.patternpro;

public class Pattern22 
{
	public static void main(String[] args) 
	{
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<a;b++)
			{
				System.out.print("0 ");
			}
			System.out.print(a+" ");
			for(int c=a;c<5;c++)
			{
				System.out.print("0 ");
			}
			System.out.println();
		}
	}
}
