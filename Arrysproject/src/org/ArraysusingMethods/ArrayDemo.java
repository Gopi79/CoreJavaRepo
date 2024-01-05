package org.ArraysusingMethods;

public class ArrayDemo 
{
	public static void main(String[] args) 
	{
		int [][] arr= {{100,200},{300,400}};
		ArrayDemo ad=new ArrayDemo();
		ad.printtwoDArray(arr);
	}
	int[][] printtwoDArray(int[][]ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		return ar;
	}
}
