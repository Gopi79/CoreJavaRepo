package com.patternpro;

public class Pattern40 
{
	public static void main(String[] args) 
	{
		int cr=1;
		int cou=1;
		for(int i=1;i<=5;i++)
		{
			if(i%2==0)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(cou+" ");
					cou++;
				}
			}
			else
			{
				int re=cr+cou-1;
				for(int k=0;k<i;k++)
				{
					System.out.print(re--+" ");
					cou++;
				}
			}
			System.out.println();
			cr++;
		}
	}
}
