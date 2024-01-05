package com.patternpro;

public class Pattern57 
{
	public static void main(String[] args) 
	{
		for(int a=0;a<5;a++)
		{
			int n=1;
			for(int b=0;b<=a;b++)
			{
				if(a==0||b==0)
					n=1;
				else
					n=n*(a-b+1)/b;
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}
}
