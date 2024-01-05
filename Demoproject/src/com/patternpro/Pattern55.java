package com.patternpro;

public class Pattern55 
{
	public static void main(String[] args) 
	{
		int cr=1;
		int cou=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			if(i%2==0)
			{
				int re=cr+cou-1;
				for(int a=0;a<i;a++)
				{
					System.out.print(re--+" ");
					cou++;
				}
			}
			else
			{
				for(int b=1;b<=i;b++)
				{
					System.out.print(cou+" ");
					cou++;
				}
			}
			System.out.println();
			cr++;
		}
	}
}
