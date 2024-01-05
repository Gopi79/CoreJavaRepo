package com.patternpro;

public class Pattern37 
{
	public static void main(String[] args) 
	{
		for(int a=1;a<=5;a++)
		{
			int b=(a*2)-1;
			for(int c=a;c<=5;c++)
			{
				System.out.print(b+" ");
				b=b+2;
			}
			for(int d=(a*2)-3;d>=1;d=d-2)
			{
				System.out.print(d+" ");
			}
			System.out.println();
		}
	}
}
