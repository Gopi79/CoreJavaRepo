package com.patternpro;

public class Pattern26 
{
	public static void main(String[] args) 
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print(j+" ");
			}
			for(int x=5-i;x<5;x++)
			{
				System.out.print(5+" ");
			}
			System.out.println();
		}
	}
}
