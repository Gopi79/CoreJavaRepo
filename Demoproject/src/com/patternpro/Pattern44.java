package com.patternpro;

public class Pattern44 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			int t=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(t+" ");
				t+=1;
			}
			t-=2;
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(t+" ");
				t-=1;
			}
			System.out.println();
		}
		for(int a=5-1;a>=1;a--)
		{
			int d=a;
			for(int b=1;b<=a;b++)
			{
				System.out.print(d+" ");
				d+=1;
			}
			d-=2;
			for(int c=a-1;c>=1;c--)
			{
				System.out.print(d+" ");
				d-=1;
			}
			System.out.println();
		}
	}
}
