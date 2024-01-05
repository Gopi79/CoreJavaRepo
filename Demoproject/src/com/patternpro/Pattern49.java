package com.patternpro;

public class Pattern49 
{
	public static void main(String[] args) 
	{
		int t=2;
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=a;b++)
			{
				while(!isprime(t))
				{
					t++;
				}
				System.out.print(t+" ");
				t++;
			}
			System.out.println();
		}
	}
	static boolean isprime(int n)
	{
		boolean flag=false;
		for(int p=2;p<=n/2;p++)
		{
			if(n%p==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
			return false;
		return true;
	}
}
