package com.patternpro;

public class Pattern42 
{
	public static void main(String[] args) 
	{
		for(int a=5;a>=1;a--)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(b);
			}
			for(int c=a*2;c<5*2-1;c++)
			{
				System.out.print(" ");
			}
			for(int d=a;d>=1;d--)
			{
				if(d!=5)
					System.out.print(d);
			}
			System.out.println();
		}
	}
}
