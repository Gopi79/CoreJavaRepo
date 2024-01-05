package com.patternpro;

public class Pattern50 
{
	public static void main(String[] args) 
	{
		System.out.println("0");
		for(int p=5;p>=1;p--)
		{
			for(int q=p;q<=5;q++)
			{
				System.out.print(q);
			}
			System.out.print("0");
			for(int r=5;r>=p;r--)
			{
				System.out.print(r);
			}
			System.out.println();
		}
	}
}
