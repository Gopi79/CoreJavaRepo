package com.patternpro;

public class Pattern53 
{
	public static void main(String[] args) 
	{
		int t=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2-1);k++)
			{
				System.out.print((int)Math.pow(t,2)+" ");
				t++;
			}
			System.out.println();
		}
	}
}
