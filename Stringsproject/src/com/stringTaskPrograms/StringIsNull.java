package com.stringTaskPrograms;

public class StringIsNull 
{
	public static void main(String[] args) 
	{
		String str1 = "gopikrishna";
		String str2 = null;
		System.out.println(isStringNull(str1));
		System.out.println(isStringNull(str2));
	}
	public static boolean isStringNull(String str) 
	{
		if (str == null)
			return true;
		else
			return false;
	}
}
