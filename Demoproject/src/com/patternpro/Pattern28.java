package com.patternpro;

public class Pattern28 
{
	public static void main(String[] args) 
	{
		int t=1;
		for(int i=1;i<=(9/2)+1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(t*j+" ");
			}
			System.out.println();
			t+=1;
		}
		for(int p=1;p<=9/2;p++)
		{
			for(int q=1;q<=(9/2)+1-p;q++)
			{
				System.out.print(t*q+" ");
			}
			System.out.println();
			t+=1;
		}
	}
}
