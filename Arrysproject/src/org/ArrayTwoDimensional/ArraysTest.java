package org.ArrayTwoDimensional;

public class ArraysTest 
{
	public static void main(String[] args) 
	{
		int [][]arr= {{10,20},{30,40}};
		
		for(int [] ar:arr)
		{
			for(int x:ar)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}
