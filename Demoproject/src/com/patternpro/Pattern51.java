package com.patternpro;

public class Pattern51 
{
	public static void main(String[] args) 
	{
		int t=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(t+" ");
				t++;
			}
			int s=t-1;
			for(int k=2;k<=i;k++)
			{
				System.out.print(--s+" ");
			}
			System.out.println();
		}
	}
}
