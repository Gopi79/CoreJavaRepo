package com.patternpro;

public class Pattern34 
{
	public static void main(String[] args) 
	{
		for(int a=1;a<=5;a++)
		{
			int b=a;
			for(int c=1;c<=5;c++)
			{
				System.out.print(b+" ");
				b++;
				if(b>5)
					b=1;
			}
			System.out.println();
		}
	}
}
