package com.patterans;

public class Pattern7 
{
	public static void main(String[] args) 
	{
		for(int t=0;t<7;t++)
		{
			for(int g=7-t;g>1;g--)
			{
				System.out.print(" ");
			}
			for(int d=0;d<=t;d++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
