package com.patternpro;

public class Pattern18 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(int p=5;p>=1;p--)
		{
			for(int q=1;q<p;q++)
			{
				System.out.print(" ");
			}
			for(int r=p;r<=5;r++)
			{
				System.out.print(r+" ");
			}
			System.out.println();
		}
	}
}
