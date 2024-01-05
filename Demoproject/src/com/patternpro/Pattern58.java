package com.patternpro;

public class Pattern58 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=5;i++)
		{
			int a=0;
			int b=1;
			System.out.print(b+" ");
			for(int j=0;j<i;j++)
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
