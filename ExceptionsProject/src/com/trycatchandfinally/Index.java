package com.trycatchandfinally;

public class Index 
{
	public static void main(String[] args) 
	{
		try
		{
			int [] myarr= {1,2,3,4};
			System.out.println(myarr[10]);
		}
		catch(Exception e)
		{
			System.out.println("Something went Wrong.");
		}
	}
}
