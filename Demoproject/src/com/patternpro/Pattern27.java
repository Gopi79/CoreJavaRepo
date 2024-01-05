package com.patternpro;

public class Pattern27 
{
	public static void main(String[] args) 
	{
		int a=1;
		for(int b=1;b<=5;b++)
		{
			a=b;
			for(int c=1;c<=b;c++)
			{
				System.out.print(a+" ");
				a+=5-c;
			}
			System.out.println();
		}
	}
}
