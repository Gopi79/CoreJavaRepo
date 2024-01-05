package com.patternpro;

public class Pattern38 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i*2;k<5*2;k++)
			{
				System.out.print(" ");
			}
			for(int l=i;l>=1;l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}
}
