package com.throwexeption;

public class Drive
{
	private String getName(int id)
	{
		if (id == 100)
		{
			return "Raju";
		}
		else if (id == 101)
		{
			return "Rani";
		}
		else
		{
			throw new NoDataFoundException("Invalid Id");
		}
	}
	public static void main(String[] args)
	{
		Drive d = new Drive();
		d.getName(200);
	}
}
