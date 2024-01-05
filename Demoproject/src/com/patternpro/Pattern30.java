package com.patternpro;

public class Pattern30 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j%2==0)
					System.out.print(((5)*(j))+i+1+" ");
				else
					System.out.print((5*(j+1))-i+" ");
			}
			System.out.println();
		}
	}
}
