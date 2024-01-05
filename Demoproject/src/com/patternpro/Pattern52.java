package com.patternpro;

public class Pattern52 
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
			for(int k=1;k<=i;k++)
			{
				System.out.print(t+" ");
				t++;
			}
			int l=t-1;
			for(int m=2;m<=i;m++)
			{
				System.out.print(--l+" ");
			}
			System.out.println();
		}
	}
}
