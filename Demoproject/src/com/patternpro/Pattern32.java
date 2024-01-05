package com.patternpro;

public class Pattern32 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			int a=0,b=1;
			for(int j=1;j<=i;j++)
			{
				int c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}
			System.out.println();
		}
	}
}
