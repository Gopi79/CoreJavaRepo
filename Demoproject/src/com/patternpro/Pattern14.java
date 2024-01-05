package com.patternpro;

public class Pattern14 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int t=i-1;t>=1;t--)
			{
				System.out.print(t);
			}
			System.out.println();
		}
	}
}
