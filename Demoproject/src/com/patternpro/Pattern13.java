package com.patternpro;

public class Pattern13 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			int n=1;
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int y=1;y<=i;y++)
			{
				System.out.print(n+" ");
				n=n*(i-y)/(y);
			}
			System.out.println();
		}
	}
}
