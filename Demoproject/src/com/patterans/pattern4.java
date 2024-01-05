package com.patterans;

public class pattern4 
{
	public static void main(String[] args) 
	{
		for(int v=1;v<=4;v++)
		{
			for(int h=1;h<=10;h++)
			{
				if(h%2==0)
					System.out.print(h+" ");
			}
			System.out.println();
		}
	}
}
