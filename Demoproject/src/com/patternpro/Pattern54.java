package com.patternpro;

public class Pattern54 
{
	public static void main(String[] args) 
	{
		int t=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(t<10)
				{
					System.out.print(t+" ");
					t++;
				}
				else
				{
					t=0;
					System.out.print(t+" ");
					t++;
				}
			}
			int q=t-1;
			for(int k=2;k<=i;k++)
			{
				if(q==0)
				{
					q=10;
					System.out.print(--q+" ");
				}
				else
				{
					System.out.print(--q+" ");
				}
			}
			System.out.println();
		}
	}
}
