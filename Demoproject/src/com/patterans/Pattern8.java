package com.patterans;

public class Pattern8 
{
	public static void main(String[] args) 
	{
		for(int y=4;y<=9;y++)
		{
			for(int z=9;z>=y;z--)
			{
				System.out.print("$ ");
			}
			System.out.println();
		}
	}
}
