package com.patternpro;

public class Pattern19 
{
	public static void main(String[] args) 
	{
		for(int a=5;a>=1;a--)
		{
			for(int b=1;b<a;b++)
			{
				System.out.print(" ");
			}
			for(int c=a;c<=5;c++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
