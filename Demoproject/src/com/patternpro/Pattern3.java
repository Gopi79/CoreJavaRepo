package com.patternpro;

public class Pattern3 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int x=5;x>=1;x--)
		{
			for(int y=1;y<x;y++)
			{
				System.out.print(y);
			}
			System.out.println();
		}
	}
}
