package com.patternpro;

public class Pattern47 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			int n=1;
			for(int k=1;k<=i;k++)
			{
				System.out.print(n+" ");
				n*=2;
			}
			n=n/4;
			for(int l=i-1;l>=1;l--)
			{
				System.out.print(n+" ");
				n/=2;
			}
			System.out.println();
		}
	}
}
