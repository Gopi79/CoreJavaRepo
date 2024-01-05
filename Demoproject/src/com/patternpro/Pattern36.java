package com.patternpro;

public class Pattern36 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			int j=(i*2)-1;
			for(int k=1;k<=5;k++)
			{
				System.out.print(j+" ");
				j=j+2;
				if(j>(5*2)-1)
					j=1;
			}
			System.out.println();
		}
	}
}
