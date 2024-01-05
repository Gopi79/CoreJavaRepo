package org.Array40Progms;

public class ArrayMissingElement 
{
	public static void main(String[] args) 
	{
		int [] a= {0,3,4,2};
		
		int [] b=new int[6];
		
		for(int i:a)
		{
			b[i]=1;
		}
		for(int x=0;x<b.length;x++)
		{
			if(b[x]==0)
				System.out.print(x+" ");
		}
	}
}
