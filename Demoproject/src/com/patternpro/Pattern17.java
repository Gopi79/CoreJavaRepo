package com.patternpro;

public class Pattern17 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		for(int a=5;a>=1;a--)
		{
			for(int b=1;b<a;b++)
			{
				System.out.print(" ");
			}
			for(int c=a;c<=5;c++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
