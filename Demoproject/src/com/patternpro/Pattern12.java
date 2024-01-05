package com.patternpro;

public class Pattern12 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			int n=i;
			for(int j=i;j>=1;j--)
			{
				System.out.print(n+" ");
				n+=5;
			}
			System.out.println();
		}
	}
}
