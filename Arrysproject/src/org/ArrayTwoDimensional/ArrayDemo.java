package org.ArrayTwoDimensional;

public class ArrayDemo 
{
	public static void main(String[] args) 
	{
		int [][] arr= {{100,200},{300,400}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
