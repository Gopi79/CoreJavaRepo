package com.patternpro;

public class Pattern24 
{
	public static void main(String[] args) 
	{
		for(int p=1;p<=5;p++)
		{
			for(int q=p;q<=5;q++)
			{
				System.out.print(q+" ");
			}
			for(int r=5-1;r>=p;r--)
			{
				System.out.print(r+" ");
			}
			System.out.println();
		}
	}
}
