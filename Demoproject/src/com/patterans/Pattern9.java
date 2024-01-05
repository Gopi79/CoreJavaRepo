package com.patterans;

public class Pattern9 
{
	public static void main(String[] args) 
	{
		for(int o=0;o<=5;o++)
		{
			for(int p=5;p>=o;p--)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
}
