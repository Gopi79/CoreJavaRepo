package com.patternpro;

public class Pattern45 
{
	public static void main(String[] args) 
	{
		int q=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(q+" ");
			}
			q++;
			System.out.println();
		}
		for(int p=5-1;p>=1;p--)
		{
			for(int r=p;r>=1;r--)
			{
				System.out.print(q+" ");
			}
			q++;
			System.out.println();
		}
	}
}
