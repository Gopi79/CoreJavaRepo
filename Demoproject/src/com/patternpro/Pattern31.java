package com.patternpro;

public class Pattern31 
{
	public static void main(String[] args)
	{
		int e=0;
		for(int a=5;a>=1;a--)
		{
			for(int b=5;b>=a;b--)
			{
				System.out.print(b+" ");
				e=b;
			}
			for(int c=5-a+1;c<5;c++)
			{
				System.out.print(e+" ");
			}
			System.out.println();
		}
	}
}
