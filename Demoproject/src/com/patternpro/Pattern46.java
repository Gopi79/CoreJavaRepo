package com.patternpro;

public class Pattern46 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(int a=5-1;a>=1;a--)
		{
			for(int b=a;b>=1;b--)
			{
				System.out.print(b+" ");
			}
			for(int c=2;c<=a;c++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
