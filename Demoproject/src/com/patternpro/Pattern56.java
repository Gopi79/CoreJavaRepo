package com.patternpro;

public class Pattern56 
{
	public static void main(String[] args) 
	{
		for(int p=1;p<=5;p++)
		{
			for(int q=1;q<=p;q++)
			{
				System.out.print((int)Math.pow(q, p)+" ");
			}
			System.out.println();
		}
	}
}
