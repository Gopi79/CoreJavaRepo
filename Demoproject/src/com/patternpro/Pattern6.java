package com.patternpro;

public class Pattern6 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int o=1;o<=i;o++)
			{
				System.out.print(o+" ");
			}
			System.out.println();
		}
	}
}
