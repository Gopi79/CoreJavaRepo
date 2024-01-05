package com.patternpro;

public class Pattern43 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(int a=5-1;a>=1;a--)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(b+" ");
			}
			for(int c=a-1;c>=1;c--)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
