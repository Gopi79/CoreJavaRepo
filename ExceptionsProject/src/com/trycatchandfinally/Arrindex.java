package com.trycatchandfinally;

public class Arrindex 
{
	public static void main(String[] args)
	{
		try
		{
			int[] arr= {2,4,6,8};
			System.out.println(arr[10]);
		}
		catch(Exception e)
		{
			System.out.println("Somthing went wrong");
		}
		finally
		{
			System.out.println("try catch will finished.");
		}
	}
}
