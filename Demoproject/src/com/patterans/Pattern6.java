package com.patterans;

public class Pattern6 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=6;i++)
		{
			for(int j=2*(6-i);j>=0;j--)
			{
				System.out.print(" ");
			}
			for(int e=0;e<=i;e++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}
