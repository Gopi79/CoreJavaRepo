package com.patternpro;

public class Pattern39 
{
	public static void main(String[] args) 
	{
		int cr=1;
		int count=1;
		for(int i=1;i<=5;i++)
		{
			if(i%2==0)
			{
				int rev=cr+count-1;
				for(int j=0;j<i;j++)
				{
					System.out.print(rev--+" ");
					count++;
				}
			}
			else
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(count+" ");
					count++;
				}
			}
			System.out.println();
			cr++;
		}
	}
}
