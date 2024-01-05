package com.patternpro;

public class Pattern29 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j%2==0)
					System.out.print(1+j*5-(j-1)*(j/2)+i-j+" ");
				else
					System.out.print(1+j*5-(j-1)*(j/2)+5-1-i+" ");
			}
			System.out.println();
		}
	}
}
